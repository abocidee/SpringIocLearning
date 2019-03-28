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
	
	
	private UserMapper userMapper;

	public User findUserById(Integer id) {
		return userMapper.findUserById(id);
	}

	public void changePassword(Integer id, String oldPassword, String newPassword) {
		// ����id���û�
		User user = findUserById(id);
		// �ж��û��Ƿ����
		if (user == null) {
			// �û�������
			throw new UserNotFoundException(
				"����ʧ�ܣ��û���Ϣ�����ڣ����¼�ѹ��ڣ�");
		} else {
			// �û����ڣ����ж�ԭ����
			if (user.getPassword().equals(oldPassword)) {
				// ԭ����ƥ�䣬ִ�и���
				userMapper.changePassword(id, newPassword);
			} else {
				// ԭ���벻ƥ��
				throw new PasswordNotMatchException(
					"����ʧ�ܣ�ԭ���벻��ȷ��");
			}
		}
	}
	
	

}





