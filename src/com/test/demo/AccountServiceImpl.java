package com.test.demo;

public class AccountServiceImpl implements AccountService {

	//配置文件方法，需提供set方法
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void pay(String out, String in, Double money) {

		accountDao.outMoney(out, money);
		accountDao.inMoney(in, money);
	}

}
