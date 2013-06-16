package com.github.noxan.bo;

import com.github.noxan.model.Account;


public interface AccountBo {
	void save(Account account);
	void update(Account account);
	void delete(Account account);
	/*Account findByUsername(String username);
	Account findByEmail(String email);*/
}
