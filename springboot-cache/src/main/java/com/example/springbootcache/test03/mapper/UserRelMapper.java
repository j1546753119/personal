package com.example.springbootcache.test03.mapper;

import com.example.springbootcache.test03.model.UserRel;
import com.example.springbootcache.test03.model.UserRelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
*UserRelMapper
* @author Shein Generator
* @since 2019/10/21
*/
public interface UserRelMapper {
    /**
    * countByExample
    * @param example example
    * @return long long
    */
    long countByExample(UserRelExample example);

    /**
    * deleteByExample
    * @param example example
    * @return int int
    */
    int deleteByExample(UserRelExample example);

    /**
    * deleteByPrimaryKey
    * @param id id
    * @return int int
    */
    int deleteByPrimaryKey(Long id);

    /**
    * insert
    * @param record record
    * @return int int
    */
    int insert(UserRel record);

    /**
    * insertSelective
    * @param record record
    * @return int int
    */
    int insertSelective(UserRel record);

    /**
    * selectByExample
    * @param example example
    * @return List<UserRel> List<UserRel>
    */
    List<UserRel> selectByExample(UserRelExample example);

    /**
    * selectByPrimaryKey
    * @param id id
    * @return UserRel UserRel
    */
    UserRel selectByPrimaryKey(Long id);

    /**
    * updateByExampleSelective
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExampleSelective(@Param("record") UserRel record, @Param("example") UserRelExample example);

    /**
    * updateByExample
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExample(@Param("record") UserRel record, @Param("example") UserRelExample example);

    /**
    * updateByPrimaryKeySelective
    * @param record record
    * @return int int
    */
    int updateByPrimaryKeySelective(UserRel record);

    /**
    * updateByPrimaryKey
    * @param record record
    * @return int int
    */
    int updateByPrimaryKey(UserRel record);
}