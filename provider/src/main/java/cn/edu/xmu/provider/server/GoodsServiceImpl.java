package cn.edu.xmu.provider.server.Impl;

import cn.edu.xmu.provider.model.GoodCartVo;
import cn.edu.xmu.provider.model.GoodsCartVo;
import cn.edu.xmu.provider.server.GoodsService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

@DubboService(version = "0.0.1")
public class GoodsServiceImpl implements GoodsService {

    /**
     * 商品模块
     * author:赖彦丞 谢沛辰
     */
    @Override
    public GoodsSKU getGoodsSkuById(Long skuid) {
        return null;
    }

    @Override
    public Integer getPriceBySkuId(Long skuId) {
        return null;
    }

    @Override
    public Boolean checkSkuIdByShopId(Long shopId, Long skuId) {
        return null;
    }

    @Override
    public List<Long> getSkuIdListByShopId(Long shopId) {
        return null;
    }

    @Override
    public List<GoodsSKU> getSkuListByShopId(Long shopId) {
        return null;
    }

    @Override
    public GoodsCartVo getCartByskuId(Long Sku) {
        return null;
    }

}