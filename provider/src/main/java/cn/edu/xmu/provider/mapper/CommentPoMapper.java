package cn.edu.xmu.provider.mapper;

import cn.edu.xmu.provider.model.po.CommentPo;
import cn.edu.xmu.provider.model.po.CommentPoExample;
import java.util.List;

public interface CommentPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    int insert(CommentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    int insertSelective(CommentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    List<CommentPo> selectByExample(CommentPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    CommentPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CommentPo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CommentPo record);
}