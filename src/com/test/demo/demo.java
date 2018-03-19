package com.test.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试转账
 * @author qiang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class demo {

	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void run(){
		
		accountService.pay("美美", "小红",  500.0);
		
	}
}
