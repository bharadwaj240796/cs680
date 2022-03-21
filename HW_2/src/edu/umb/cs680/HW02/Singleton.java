package edu.umb.cs680.HW02;

public class Singleton 
{
	private static Singleton instance = null;
	 private Singleton() { }
	 static Singleton getInstance() {
			if (instance == null) 
			{
				instance = new Singleton();
			}
			System.out.println();
			return instance;
		}
	public static void main(String[] args)
	{
		Singleton inst1 = Singleton.getInstance();
		System.out.println(inst1.hashCode());
		Singleton inst2 = Singleton.getInstance();
		System.out.println(inst2.hashCode());
	}
}
