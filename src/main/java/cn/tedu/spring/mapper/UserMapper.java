package cn.tedu.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.spring.entity.User;

public interface UserMapper {
	
	/**
	 * �û�ע��
	 * @param user �û���Ϣ
	 * @return ��Ӱ�������
	 */
	Integer reg(User user);
	
	/**
	 * �����û�id��ѯ�û���Ϣ
	 * @param id �û�id
	 * @return ƥ����û���Ϣ
	 */
	User findUserById(Integer id);
	
	/**
	 * �����û�����ѯ�û���Ϣ
	 * @param username �û���
	 * @return ƥ����û���Ϣ
	 */
	User findUserByUsername(String username);
	
	/**
	 * ��ȡ�����û���Ϣ
	 * @return �����û������ݵļ���
	 */
	List<User> getUserList();
	
	/**
	 * ɾ���û�����
	 * @param id �û����ݵ�id
	 * @return ��Ӱ������������ɾ���ɹ�������1�����򣬷���0
	 */
	Integer delete(Integer id);
	
	/**
	 * �޸�����
	 * @param id ���޸ĵ����ݵ�id
	 * @param newPassword ������
	 * @return ��Ӱ�������������޸ĳɹ�������1�����򣬷���0
	 */
	Integer changePassword(
		@Param("id") Integer id,
		@Param("newPassword") String newPassword);
	
	/**
	 * �޸����� 
	 * @param id ���޸ĵ����ݵ�id
	 * @param age �µ�����ֵ
	 * @return ��Ӱ�������������޸ĳɹ�������1�����򣬷���0
	 */
	Integer updateAge(
			@Param("id") Integer id, 
			@Param("age") Integer age);

	/**
	 * �޸�������������
	 * @param user �û�����
	 * @return ��Ӱ�������������޸ĳɹ�������1�����򣬷���0
	 */
	Integer update(User user);
	
}










