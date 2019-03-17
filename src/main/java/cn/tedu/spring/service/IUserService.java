package cn.tedu.spring.service;

import cn.tedu.spring.entity.User;

public interface IUserService {

	/**
	 * 根据用户id查询用户信息
	 * @param id 用户id
	 * @return 匹配的用户信息
	 */
	User findUserById(Integer id);
	
	/**
	 * 修改密码
	 * @param id 用户的id
	 * @param oldPassword 原密码
	 * @param newPassword 新密码
	 */
	void changePassword(Integer id,
			String oldPassword,
			String newPassword);
	
}









