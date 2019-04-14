package cn.lyl.ssh.test;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lyl.ssh.model.Topic;
import cn.lyl.ssh.model.User;

public class test {
	
	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource datasource = (DataSource) ctx.getBean("dataSource");
		System.out.println(datasource);

	}
}
