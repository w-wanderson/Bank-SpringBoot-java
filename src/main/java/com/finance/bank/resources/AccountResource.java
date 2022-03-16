package com.finance.bank.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.bank.entites.Account;

@RestController
@RequestMapping(value ="/Accounts")
public class AccountResource {
	
	
	@GetMapping
	public ResponseEntity<Account> findAll(){
		
		Account account = new Account(1L,"Maria","margia@gmail.com","487878","1213");
		return ResponseEntity.ok().body(account);
	}

}
