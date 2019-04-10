package cn.tedu.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.tedu.spring.entity.User;
@Mapper
public interface UserMapper {
	
	/**
	 * 锟矫伙拷注锟斤拷
	 * @param user 锟矫伙拷锟斤拷息
	 * @return 锟斤拷影锟斤拷锟斤拷锟斤拷锟�
	 */
	Integer reg(User user);
	
	/**
	 * 锟斤拷锟斤拷锟矫伙拷id锟斤拷询锟矫伙拷锟斤拷息
	 * @param id 锟矫伙拷id
	 * @return 匹锟斤拷锟斤拷没锟斤拷锟较�
	 */
	
	User findUserById(Integer id);
	
	/**
	 * 锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷询锟矫伙拷锟斤拷息
	 * @param username 锟矫伙拷锟斤拷
	 * @return 匹锟斤拷锟斤拷没锟斤拷锟较�
	 */
	User findUserByUsername(String username);
	
	/**
	 * 锟斤拷取锟斤拷锟斤拷锟矫伙拷锟斤拷息
	 * @return 锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷锟捷的硷拷锟斤拷
	 */
	List<User> getUserList();
	
	/**
	 * 删锟斤拷锟矫伙拷锟斤拷锟斤拷
	 * @param id 锟矫伙拷锟斤拷锟捷碉拷id
	 * @return 锟斤拷影锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷删锟斤拷锟缴癸拷锟斤拷锟斤拷锟斤拷1锟斤拷锟斤拷锟津，凤拷锟斤拷0
	 */
	Integer delete(Integer id);
	
	/**
	 * 锟睫革拷锟斤拷锟斤拷
	 * @param id 锟斤拷锟睫改碉拷锟斤拷锟捷碉拷id
	 * @param newPassword 锟斤拷锟斤拷锟斤拷
	 * @return 锟斤拷影锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟睫改成癸拷锟斤拷锟斤拷锟斤拷1锟斤拷锟斤拷锟津，凤拷锟斤拷0
	 */
	Integer changePassword(
		@Param("id") Integer id,
		@Param("newPassword") String newPassword);
	
	/**
	 * 锟睫革拷锟斤拷锟斤拷 
	 * @param id 锟斤拷锟睫改碉拷锟斤拷锟捷碉拷id
	 * @param age 锟铰碉拷锟斤拷锟斤拷值
	 * @return 锟斤拷影锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟睫改成癸拷锟斤拷锟斤拷锟斤拷1锟斤拷锟斤拷锟津，凤拷锟斤拷0
	 */
	Integer updateAge(
			@Param("id") Integer id, 
			@Param("age") Integer age);

	/**
	 * 锟睫革拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
	 * @param user 锟矫伙拷锟斤拷锟斤拷
	 * @return 锟斤拷影锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟睫改成癸拷锟斤拷锟斤拷锟斤拷1锟斤拷锟斤拷锟津，凤拷锟斤拷0
	 */
	Integer update(User user);
	
}










