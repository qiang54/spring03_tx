package com.test.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.demo3.AccountService;

/**
 * 测试转账
 * @author qiang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class demo3 {

	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void run(){
		
		accountService.pay("美美", "小红",  200.0);
		
	}
}
