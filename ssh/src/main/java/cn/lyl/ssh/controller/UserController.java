package cn.lyl.ssh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.lyl.ssh.model.User;
import cn.lyl.ssh.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/registview",method=RequestMethod.GET)
	public String registview(Model model) {
		model.addAttribute("user",new User());
		return "regist";
	}
	
	@RequestMapping(value="/userregist",method=RequestMethod.POST)
	public String regist(User user){
		System.out.println(user);
		userService.add(user);
		return "index";
	}
	
	@RequestMapping(value="userlogin",method=RequestMethod.POST)
	public String login(String username,String password,Model model) {
		System.out.println(username+"---"+password);
		String message = "";
		if(username!=null && username!="" && password!=null && password!="") {
			User user = userService.getUsername(username);
			System.out.println(user);
			if(user!=null) {
				if(user.getPassword().equals(password)) {
					return "index";
				}else {
					 message = "√‹¬Î¥ÌŒÛ";
					model.addAttribute("res",message);
					return "login";
				}
			}else {
				message = "”√ªß√˚¥ÌŒÛ";
				model.addAttribute("res",message);
				return "login";
			}
		}
		return "error";
	}
	
}
