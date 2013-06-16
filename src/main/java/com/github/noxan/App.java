package com.github.noxan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.noxan.bo.AccountBo;
import com.github.noxan.model.Account;


public class App {
    public static void main(String[] args ) {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/HibernateContext.xml");
    	
    	AccountBo accountBo = (AccountBo)appContext.getBean("accountBo");
    	
    	Account account = new Account("noxan", "noxan@byteweaver.org", "123");
    	accountBo.save(account);
    	
    	System.out.println(account);
    }
}
