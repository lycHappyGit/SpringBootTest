package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.lyc.Application;
import cn.lyc.dao.UserMapper;
import cn.lyc.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class ApplicationTest {

	@Autowired
	private UserMapper um;
	
	@Test
	public void test1(){
		
		User user = um.selectByPrimaryKey(1);
		System.out.println(user);
	}
	
}
