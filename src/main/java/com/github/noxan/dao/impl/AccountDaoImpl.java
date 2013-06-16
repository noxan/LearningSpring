package com.github.noxan.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.noxan.dao.AccountDao;
import com.github.noxan.model.Account;


@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
	
	
	@Override
	public void save(Account account) {
		getCurrentSession().save(account);
	}
	
	@Override
	public void update(Account account) {
		getCurrentSession().update(account);
	}
	
	@Override
	public void delete(Account account) {
		getCurrentSession().delete(account);
	}
	
	@Override
	public List findByUsername(String username) {
		Criteria criteria = getCurrentSession().createCriteria(Account.class);
        criteria.add(Restrictions.like("username", username, MatchMode.START));
        return criteria.list();
	}
}
