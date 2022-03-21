package edu.umb.cs680.HW01;

import java.util.LinkedList;

public class PrimeGenerator 
{
	protected long from;
	protected long to;
	protected LinkedList<Long> prime = new LinkedList<Long>();
	public PrimeGenerator(long from, long to)
	{
		this.from=from;
		this.to=to;
	}
	public void generatePrimes(long n)
	{
		int c=0;
		for (long i=n;i>=1 ;i-- )
		{
			if (n%i==0)
			{
				c++;
			}
		}
		if (c==2)
			{
				prime.add(n);
			}
	}
	public LinkedList<Long> getPrimes()
	{
		for(long i=from;i<=to;i++)
		{
			generatePrimes(i);
		}
		return prime;
	}
	public void arrayPrimes()
	{
		Object[] oa= prime.toArray();
		long []ap=new long[oa.length];
		for(int i=0;i<oa.length;i++)
		{
			ap[i]=(long)oa[i];
		}
		for(int i=0;i<ap.length;i++)
		{
			System.out.println(ap[i]);
		}
	}
	public static void main(String[] args)
	{
		PrimeGenerator gen = new PrimeGenerator(1,10);
		System.out.println(gen.getPrimes());
		gen.arrayPrimes();
	}
}