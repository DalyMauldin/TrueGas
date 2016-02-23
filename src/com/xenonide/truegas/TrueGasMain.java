package com.xenonide.truegas;

public class TrueGasMain {

	public static void main(String[] args) {
		Car verano = new Car("buick", "verano", 2015, 21.0);
		System.out.println(verano);
		
		Car sonata = new Car("hyundai", "sonata", 2009, 22.0);
		System.out.println(sonata);
		
		Car sedona = new Car("kia", "sedona", 2011, 18.0);
		System.out.println(sedona);
	}
}
