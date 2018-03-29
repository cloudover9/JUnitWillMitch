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

	@Test
	public void testGetStartTime() {
		int expResult = 0;
	    int result = ntc.getStartTime();
	    assertEquals("Hours is " + expResult,expResult, result);;
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForNegative() {
		int inTime = -5;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForBoundry() {
		int inTime = -1;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForOOB() {
		int inTime = 2544;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForOOBBoundry() {
		int inTime = 2400;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForOOBBoundryP1() {
		int inTime = 2401;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForInvalidMinutes() {
		int inTime = 1578;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForInvalidMinutesBoundry() {
		int inTime = 1160;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForInvalidMinutesBoundry1() {
		int inTime = 1161;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testStartTimeFailsForInvalidMinandLen() {
		int inTime = 799;
		int inLen = -5;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	
		}
	
	
	
	
	@Test(expected = UnsupportedOperationException.class)
	public void testFailsForInvalidDur() {
		int inTime = 1800;
		int inLen = 0;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	
		}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testFailsForInvalidDur2() {
		int inTime = 1801;
		int inLen = -1;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		ntc.computeCharge();	
		}
	
	@Test
	public void testComputeChargeBothDisc() {
		int inTime = 500;
		int inLen = 100;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1768.0);	
		}
	
	
	@Test
	public void testComputeChargeBothDisc2() {
		int inTime = 759;
		int inLen = 61;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1078.48);	
		}
	
	@Test
	public void testComputeChargeBothDisc3() {
		int inTime = 1959;
		int inLen = 61;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1078.48);	
		}
	
	@Test
	public void testComputeChargeBothDisc4() {
		int inTime = 2359;
		int inLen = 65;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1149.2);	
		}
	
	@Test
	public void testComputeChargeSTDisc() {
		int inTime = 0;
		int inLen = 60;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1248.0);	
		}
	
	@Test
	public void testComputeChargeSTDisc2() {
		int inTime = 400;
		int inLen = 59;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1227.2);	
		}
	
	@Test
	public void testComputeChargeSTDisc3() {
		int inTime = 1800;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==208.0);	
		}
	
	@Test
	public void testComputeChargeSTDisc4() {
		int inTime = 1801;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==208.0);	
		}
	
	@Test
	public void testComputeChargeSTDisc5() {
		int inTime = 2359;
		int inLen = 10;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==208.0);	
		}
	
	@Test
	public void testComputeChargeDurDisc() {
		int inTime = 800;
		int inLen = 65;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==2298.4);	
		}
	
	@Test
	public void testComputeChargeDurDisc2() {
		int inTime = 900;
		int inLen = 61;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==2156.96);	
		}
	
	@Test
	public void testComputeChargeNoDisc() {
		int inTime = 1000;
		int inLen = 40;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==1664.0);	
		}
	
	@Test
	public void testComputeChargeNoDisc2() {
		int inTime = 800;
		int inLen = 1;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==41.6);	
		}
	
	@Test
	public void testComputeChargeNoDisc3() {
		int inTime = 801;
		int inLen = 59;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==2454.4);	
		}
	
	@Test
	public void testComputeChargeNoDisc4() {
		int inTime = 1759;
		int inLen = 60;
		ntc.setStartTime(inTime);
		ntc.setDuration(inLen);
		assertTrue(ntc.computeCharge()==2496.0);	
		}

}
