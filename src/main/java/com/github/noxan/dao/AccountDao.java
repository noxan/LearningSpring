package com.github.noxan.dao;

import java.util.List;

import com.github.noxan.model.Account;

public interface AccountDao {
	void save(Account account);
	void update(Account account);
	void delete(Account account);
	List findByUsername(String username);
}
