package edu.umb.cs680.HW01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void generatePrimes1to10() 
	{
		long from=1;
		long to=10;
		PrimeGenerator gen = new PrimeGenerator(from,to);
		long[] expectedPrimes = {2, 3, 5, 7};
		Object[] oa=gen.getPrimes().toArray();
		long[] actualPrimes=new long[oa.length];
		for(int i=0;i<oa.length;i++)
		{
			actualPrimes[i]=(long)oa[i];
		}
		assertArrayEquals( expectedPrimes,actualPrimes);
	}
}