package edu.umb.cs680.HW11;

import java.util.Comparator;
public class MileageComparator implements Comparator<Car> 
{
	public int compare(Car car1, Car car2) 
	{
		return car2.getMileage() - car1.getMileage();
	}

	public static void main(String[] args)
	{
		System.out.println("MileageComparator Class Successfully Executed");
	}
}