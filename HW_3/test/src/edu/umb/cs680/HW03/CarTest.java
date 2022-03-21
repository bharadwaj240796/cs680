package edu.umb.cs680.HW03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carString = { car.getMake(), car.getModel(), String.valueOf(car.getYear()) };
		return carString;
	}

	@Test
	public void compareCarWithMakeModelYear() {
		Car actual1 = new Car("Toyota", "RAV4", 1000000, 15, 2018);
		Car actual2 = new Car("AUDI", "CLASS Q3", 3500000, 10, 2021);
		String[] expected1 = { "Toyota", "RAV4", "2018" };
		String[] expected2 = { "AUDI", "CLASS Q3", "2021" };
		assertArrayEquals(expected1, carToStringArray(actual1));
		assertArrayEquals(expected2, carToStringArray(actual2));
	}
}