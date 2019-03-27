package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {

	private NewTelephoneCompany ntc;
	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidStart() {
		ntc.setStartTime(2544);
	    ntc.setDuration(10);
	    ntc.computeCharge();
	}

	@Test (expected = UnsupportedOperationException.class)
	public void testComputeChargeInvalidDuration() {
		ntc.setStartTime(1801);
	    ntc.setDuration(-1);
	    ntc.computeCharge();
	}

	@Test 
	public void testComputeChargeDiscountBoth() {
		ntc.setStartTime(500);
	    ntc.setDuration(100);
	    ntc.computeCharge();
	}

	@Test 
	public void testComputeChargeDiscountStart() {
		ntc.setStartTime(400);
	    ntc.setDuration(59);
	    ntc.computeCharge();
	}

	@Test
	public void testComputeChargeDiscountDuration() {
		ntc.setStartTime(800);
	    ntc.setDuration(65);
	    ntc.computeCharge();
	}
	
	@Test
	public void testComputeChargeNoDiscount() {
		ntc.setStartTime(1000);
	    ntc.setDuration(40);
	    ntc.computeCharge();
	}

}