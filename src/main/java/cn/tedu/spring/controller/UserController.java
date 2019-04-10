package cn.tedu.spring.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.tedu.spring.entity.User;
import cn.tedu.spring.mapper.UserMapper;
import cn.tedu.spring.service.UserServiceImpl;

@Controller
public class UserController {
	
    @Resource
	public UserMapper userMapper;
    
    
    @RequestMapping("/findUser.do")
    public void findUser(HttpServletRequest request , HttpServletResponse response) {
    	int id =Integer.parseInt(request.getParameter("id"));
    	request.setAttribute("id", id);
    	System.out.println("usermapper     "+userMapper);	
    	User user =userMapper.findUserById(id);
        System.out.println(user.getUsername());
    	
    	
    }
}
