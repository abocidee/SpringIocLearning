package cn.tedu.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.spring.entity.User;
import cn.tedu.spring.mapper.UserMapper;
import cn.tedu.spring.service.ex.PasswordNotMatchException;
import cn.tedu.spring.service.ex.UserNotFoundException;

@Service
public class UserServiceImpl
	implements IUserService {
	
	@Resource
	private UserMapper userMapper;

	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}

	public void changePassword(Integer id, String oldPassword, String newPassword) {
		// 根据id找用户
		User user = findUserById(id);
		// 判断用户是否存在
		if (user == null) {
			// 用户不存在
			throw new UserNotFoundException(
				"操作失败！用户信息不存在，或登录已过期！");
		} else {
			// 用户存在，则判断原密码
			if (user.getPassword().equals(oldPassword)) {
				// 原密码匹配，执行更新
				userMapper.changePassword(id, newPassword);
			} else {
				// 原密码不匹配
				throw new PasswordNotMatchException(
					"操作失败！原密码不正确！");
			}
		}
	}
	
	

}





