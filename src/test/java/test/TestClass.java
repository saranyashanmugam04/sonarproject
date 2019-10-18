package test;

import org.junit.Assert;
import org.junit.Test;

import Pack.calculation;


public class TestClass {
	calculation obj=new calculation();
	
	@Test
	public void testcase1() {
		
		Assert.assertEquals(4,obj.adder(2,2));
	}

}
