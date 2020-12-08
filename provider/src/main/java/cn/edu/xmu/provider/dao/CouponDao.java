package cn.edu.xmu.provider.dao;


import cn.edu.xmu.provider.mapper.CouponPoMapper;
import cn.edu.xmu.provider.model.po.CouponPo;
import cn.edu.xmu.provider.util.ResponseCode;
import cn.edu.xmu.provider.util.ReturnObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


/**
 * @author Feiyan Liu
 * @date Created at 2020/12/3 17:03
 */
@Repository
public class CouponDao implements InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(CouponActivityDao.class);
    @Autowired
    private CouponPoMapper couponMapper;
    /**
     * 是否初始化，生成signature和加密
     */
    @Value("${couponservice.initialization}")
    private Boolean initialization;

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    /**
     * @description: 更新优惠券状态
     * @param id
     * @param state
     * @return: cn.edu.xmu.ooad.util.ReturnObject
     * @author: Feiyan Liu
     * @date: Created at 2020/12/3 19:04
     */
    public ReturnObject updateCouponState(Long id,Integer state) {
        ReturnObject returnObject = null;
        try {
            CouponPo po = couponMapper.selectByPrimaryKey(id);
            po.setState((byte) state.intValue());
            int ret = couponMapper.updateByPrimaryKeySelective(po);
            if (ret == 0) {
                logger.debug("updateCouponState: update fail. coupon id: " + id);
                returnObject = new ReturnObject(ResponseCode.RESOURCE_ID_NOTEXIST);
            } else {
                logger.debug("updateCouponState: update success. coupon id: " + id);
                returnObject = new ReturnObject();
            }
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
        }
        return returnObject;
    }

    public CouponPo getCouponById(Long id)
    {
        CouponPo po=null;
        try {
             po = couponMapper.selectByPrimaryKey(id);
             logger.debug("po的id"+po.getId());
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
        }
        return po;
    }


}
