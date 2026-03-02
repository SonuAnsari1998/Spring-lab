package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class BillService {
	@Autowired
	private Consumer con;
	@Autowired
	private BillCalculator billcal;
	
	public void printBill() {
		System.out.println("Electricity Bill\r\n"
				+ "Consumer: "+con.getName()+"\r\n"
				+ "Units Consumed: "+con.getUnitsConsumed()+"\r\n"
				+ "Total Bill: Rs. "+(con.getUnitsConsumed()*billcal.calculateBill(con.getUnitsConsumed()))+"");
	}
}
