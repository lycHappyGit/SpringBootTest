package cn.lyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.lyc.dao.UserMapper;
import cn.lyc.entity.User;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserMapper um;

	@RequestMapping("aa")
	public String aa(){
		
		return "Hello World SpringBootTest Lyc";
	}
	
	@RequestMapping("bb")
	public String bb(){
		
		User user = um.selectByPrimaryKey(1);
		return JSONObject.toJSONString(user);
	}
}
