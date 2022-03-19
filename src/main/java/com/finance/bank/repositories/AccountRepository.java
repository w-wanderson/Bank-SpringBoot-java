package com.finance.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.bank.entites.Account;


public interface AccountRepository extends JpaRepository<Account, Long>{
	
	

}
