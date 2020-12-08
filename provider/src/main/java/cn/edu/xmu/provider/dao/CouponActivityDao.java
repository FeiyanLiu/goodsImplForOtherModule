package cn.edu.xmu.provider.dao;


import cn.edu.xmu.provider.mapper.CouponActivityPoMapper;
import cn.edu.xmu.provider.model.po.CouponActivityPo;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


/**
 * @author Feiyan Liu
 * @date Created at 2020/11/29 9:54
 */
@Repository
@Mapper
public class CouponActivityDao implements InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(CouponActivityDao.class);
    @Autowired
    private CouponSkuDao couponSkuDao;
    @Autowired
    private CouponActivityPoMapper couponActivityMapper;
    /**
     * 是否初始化，生成signature和加密
     */
    @Value("${couponservice.initialization}")
    private Boolean initialization;

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    /**
     * @param id
     * @description: 根据活动id获取优惠活动详情
     * @return: cn.edu.xmu.ooad.util.ReturnObject<cn.edu.xmu.coupon.model.bo.CouponActivity>
     * @author: Feiyan Liu
     * @date: Created at 2020/11/30 17:04
     */
    public CouponActivityPo getCouponActivityById(Long id) {
        CouponActivityPo po = new CouponActivityPo();
        try {
            po = couponActivityMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            StringBuilder message = new StringBuilder().append("getCouponActivityById: ").append(e.getMessage());
            logger.debug(message.toString());
        }
        return po;
    }
}

