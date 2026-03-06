package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteBankFactory implements BankFactory {

	@Autowired
	SBI sbi;
	@Autowired
	HDFC hdfc;

	public Bank createBank(String bankType) {
		Bank bank = null;
		if (bankType.equals("sbi"))
			bank = new SBI();
		else if (bankType.equals("hdfc"))
			bank = new HDFC();
		return bank;
	}
}
