package com.finance.bank.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.bank.entites.Account;
import com.finance.bank.services.AccountService;

@RestController
@RequestMapping(value ="/Accounts")
public class AccountResource {
	
	@Autowired
	private AccountService service;
	
	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Account> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Account> findByid(@PathVariable Long id){
		Account obj = service.findByid(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
