package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhidi.entity.Dept;
import com.zhidi.service.IDeptService;

public class TestService {
	
	private ApplicationContext context;
	
	@Before
	public void beforeMethod(){
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void getTest() {
		IDeptService bean = context.getBean("deptServiceImpl",IDeptService.class);
		Dept dept = bean.get(2);
		System.err.println(dept);
	}
}
