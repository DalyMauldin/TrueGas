package com.xenonide.truegas;

public class TrueGasMain {

	public static void main(String[] args) {
		Car verano = new Car("buick", "verano", 2015, 21.0, 30000, 1.45, 30500, 14.4, 15.6);
		System.out.println(verano);
		
		Car sonata = new Car("hyundai", "sonata", 2009, 22.0, 101300, 1.45, 101600, 12.3, 17.7);
		System.out.println(sonata);
		
		Car sedona = new Car("kia", "sedona", 2011, 18.0, 105000, 1.45, 105900, 19.9, 21.1);
		System.out.println(sedona);
		
		Car brokencar = new Car("not a", "real car", 1930, -2, 0, 1.45, -12, 19.9, 18);
		System.out.println(brokencar);

	}
}
