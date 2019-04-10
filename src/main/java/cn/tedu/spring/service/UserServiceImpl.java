package cn.tedu.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.spring.entity.User;
import cn.tedu.spring.mapper.UserMapper;
import cn.tedu.spring.service.ex.PasswordNotMatchException;
import cn.tedu.spring.service.ex.UserNotFoundException;

@Service
public class UserServiceImpl
	implements IUserService {
	
	@Autowired
	private UserMapper userMapper;

	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}

	public void changePassword(Integer id, String oldPassword, String newPassword) {
		// 锟斤拷锟斤拷id锟斤拷锟矫伙拷
		User user = findUserById(id);
		// 锟叫讹拷锟矫伙拷锟角凤拷锟斤拷锟�
		if (user == null) {
			// 锟矫伙拷锟斤拷锟斤拷锟斤拷
			throw new UserNotFoundException(
				"锟斤拷锟斤拷失锟杰ｏ拷锟矫伙拷锟斤拷息锟斤拷锟斤拷锟节ｏ拷锟斤拷锟铰硷拷压锟斤拷冢锟�");
		} else {
			// 锟矫伙拷锟斤拷锟节ｏ拷锟斤拷锟叫讹拷原锟斤拷锟斤拷
			if (user.getPassword().equals(oldPassword)) {
				// 原锟斤拷锟斤拷匹锟戒，执锟叫革拷锟斤拷
				userMapper.changePassword(id, newPassword);
			} else {
				// 原锟斤拷锟诫不匹锟斤拷
				throw new PasswordNotMatchException(
					"锟斤拷锟斤拷失锟杰ｏ拷原锟斤拷锟诫不锟斤拷确锟斤拷");
			}
		}
	}
	
	

}





