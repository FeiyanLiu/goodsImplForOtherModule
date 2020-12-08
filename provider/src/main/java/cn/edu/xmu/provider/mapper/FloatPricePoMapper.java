package cn.edu.xmu.provider.mapper;

import cn.edu.xmu.provider.model.po.FloatPricePo;
import cn.edu.xmu.provider.model.po.FloatPricePoExample;
import java.util.List;

public interface FloatPricePoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int insert(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int insertSelective(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    List<FloatPricePo> selectByExample(FloatPricePoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    FloatPricePo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FloatPricePo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table float_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FloatPricePo record);
}