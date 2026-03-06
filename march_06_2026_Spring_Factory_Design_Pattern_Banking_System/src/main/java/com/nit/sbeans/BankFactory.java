package com.nit.sbeans;

import org.springframework.stereotype.Component;

public interface BankFactory {

	public Bank createBank(String bankType);
}
