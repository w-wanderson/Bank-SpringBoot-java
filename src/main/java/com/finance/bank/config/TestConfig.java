package com.finance.bank.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.finance.bank.entites.Account;
import com.finance.bank.repositories.AccountRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private AccountRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Account acc1 = new Account(null, "wanderson santos", "wanderson@gmail.com","4545","454545");
		Account acc2 = new Account(null, "josete", "josete@gmail.com","123","1545");
		
		userRepository.saveAll(Arrays.asList(acc1,acc2));
		
	}
	
	
	
	
}
