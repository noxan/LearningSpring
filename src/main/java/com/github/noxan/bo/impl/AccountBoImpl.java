package com.github.noxan.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.noxan.bo.AccountBo;
import com.github.noxan.dao.AccountDao;
import com.github.noxan.model.Account;


@Service("accountBo")
public class AccountBoImpl implements AccountBo {
	@Autowired
	private AccountDao accountDao;

	@Override
    @Transactional(readOnly = false)
	public void save(Account account) {
		accountDao.save(account);
	}

	@Override
    @Transactional(readOnly = false)
	public void update(Account account) {
		accountDao.update(account);
	}

	@Override
    @Transactional(readOnly = false)
	public void delete(Account account) {
		accountDao.delete(account);
	}
	
	/*public Account findByUsername(String username) {
		return accountDao.findByUsername(username);
	}*/
}
