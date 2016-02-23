package com.xenonide.truegas;

public class TrueGasMain {

	public static void main(String[] args) {
		Car verano = new Car("buick", "verano", 2015, 21.0, 30000);
		System.out.println(verano);
		verano.setMakempd(1.45);
		System.out.println(verano.getMakempd() + " mpd determined by Maker.");
		
		Car sonata = new Car("hyundai", "sonata", 2009, 22.0, 102500);
		System.out.println(sonata);
		sonata.setMakempd(1.45);
		System.out.println(sonata.getMakempd() + " mpd determined by Maker.");
		
		Car sedona = new Car("kia", "sedona", 2011, 18.0, 105000);
		System.out.println(sedona);
		sedona.setMakempd(1.45);
		System.out.println(sedona.getMakempd() + " mpd determined by Maker.");
		
		Car brokencar = new Car("not a", "real car", 1930, -2, 0);
		System.out.println(brokencar);
		brokencar.setMakempd(1.45);
		System.out.println(brokencar.getMakempd() + " mpd determined by Maker.");
		
		
		//I am testing zee software
	}
}
