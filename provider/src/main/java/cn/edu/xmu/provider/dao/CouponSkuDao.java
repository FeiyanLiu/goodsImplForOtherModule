package cn.edu.xmu.provider.dao;


import cn.edu.xmu.provider.mapper.CouponSkuPoMapper;
import cn.edu.xmu.provider.model.po.CouponSkuPo;
import cn.edu.xmu.provider.model.po.CouponSkuPoExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Feiyan Liu
 * @date Created at 2020/12/2 10:51
 */
@Repository
public class CouponSkuDao implements InitializingBean {
    private static final Logger logger = LoggerFactory.getLogger(CouponActivityDao.class);
    @Autowired
    private CouponSkuPoMapper couponSkuMapper;
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
     * @description: 根据活动id获取活动商品列表
     * @return: cn.edu.xmu.ooad.util.ReturnObject<java.util.List>
     * @author: Feiyan Liu
     * @date: Created at 2020/11/30 22:17
     */
    public List<CouponSkuPo> getCouponSkuListByActivityId(Long id) {
        CouponSkuPoExample example = new CouponSkuPoExample();
        CouponSkuPoExample.Criteria criteria = example.createCriteria();
        criteria.andActivityIdEqualTo(id);
        List<CouponSkuPo> couponSkuPos = null;
        try {
            couponSkuPos = couponSkuMapper.selectByExample(example);
            if (couponSkuPos.isEmpty()) {
                logger.debug("getCouponSkuByActivityId: Not Found");
            } else logger.debug("getCouponSkuByActivityId: retCouponSku" + couponSkuPos);
        } catch (Exception e) {
            logger.error("发生了严重的服务器内部错误：" + e.getMessage());
        }
        return couponSkuPos;
    }

}
