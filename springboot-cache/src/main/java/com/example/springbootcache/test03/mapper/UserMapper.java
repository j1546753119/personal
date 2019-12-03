package com.example.springbootcache.test03.mapper;

import com.example.springbootcache.test03.model.User;
import com.example.springbootcache.test03.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
*UserMapper
* @author Shein Generator
* @since 2019/10/20
*/
public interface UserMapper {
    /**
    * countByExample
    * @param example example
    * @return long long
    */
    long countByExample(UserExample example);

    /**
    * deleteByExample
    * @param example example
    * @return int int
    */
    int deleteByExample(UserExample example);

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
    int insert(User record);

    /**
    * insertSelective
    * @param record record
    * @return int int
    */
    int insertSelective(User record);

    /**
    * selectByExample
    * @param example example
    * @return List<User> List<User>
    */
    List<User> selectByExample(UserExample example);

    /**
    * selectByPrimaryKey
    * @param id id
    * @return User User
    */
    User selectByPrimaryKey(Long id);

    /**
    * updateByExampleSelective
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
    * updateByExample
    * @param record record
    * @param example example
    * @return int int
    */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
    * updateByPrimaryKeySelective
    * @param record record
    * @return int int
    */
    int updateByPrimaryKeySelective(User record);

    /**
    * updateByPrimaryKey
    * @param record record
    * @return int int
    */
    int updateByPrimaryKey(User record);
}