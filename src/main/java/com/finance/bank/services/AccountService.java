package com.finance.bank.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.bank.entites.Account;
import com.finance.bank.repositories.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public List<Account> findAll(){
		return repository.findAll();
		
	}

	public Account findByid(long id) {
		Optional<Account> obj = repository.findById(id);
		return obj.get();
	}
}
