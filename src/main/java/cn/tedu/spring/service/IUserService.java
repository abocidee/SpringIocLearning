package cn.tedu.spring.service;

import cn.tedu.spring.entity.User;

public interface IUserService {

	/**
	 * �����û�id��ѯ�û���Ϣ
	 * @param id �û�id
	 * @return ƥ����û���Ϣ
	 */
	User findUserById(Integer id);
	
	/**
	 * �޸�����
	 * @param id �û���id
	 * @param oldPassword ԭ����
	 * @param newPassword ������
	 */
	void changePassword(Integer id,
			String oldPassword,
			String newPassword);
	
}









