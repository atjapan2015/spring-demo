package com.example.demo.mapper;

import com.example.demo.dataset.User;
import com.example.demo.dataset.UserExample;
import com.example.demo.dataset.UserKey;
import com.example.demo.dataset.UserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Fri Nov 23 14:50:24 CST 2018
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}