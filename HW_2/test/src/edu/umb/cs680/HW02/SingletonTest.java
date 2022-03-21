package edu.umb.cs680.HW02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	public void checkingNotNullReturns() 
	{
		Singleton inst = Singleton.getInstance();
		assertNotNull(inst);
	}
	@Test
	public void checkingSameInstances() 
	{
		Singleton inst = Singleton.getInstance();
		assertNotNull(inst);
	}
	@Test
	public void checkingHashcode() 
	{
		Singleton inst = Singleton.getInstance();
		assertNotNull(inst);
	}

}
