package cn.edu.xmu.provider.mapper;

import cn.edu.xmu.provider.model.po.TimeSegmentPo;
import cn.edu.xmu.provider.model.po.TimeSegmentPoExample;
import java.util.List;

public interface TimeSegmentPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    int insert(TimeSegmentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    int insertSelective(TimeSegmentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    List<TimeSegmentPo> selectByExample(TimeSegmentPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    TimeSegmentPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TimeSegmentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_segment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeSegmentPo record);
}