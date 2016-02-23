package com.xenonide.truegas;

public class Car {
	//Car Attributes
	private String make;
	private String model;
	private int year;
	private double makempg;
	private double truempg;
	private double truempd;
	//End Car Attributes
	
	//Final Values
	private final int MAX_YEAR = 2017;
	//End Final Values
	
	//Attribute Sets and Gets
	//Make
	public void setMake(String x){
		make = x;
	}
	public String getMake(){
		return make;
	}
	//Model
	public void setModel(String x){
		model = x;
	}
	public String getModel(){
		return model;
	}
	//Year
	public void setYear(int x){
		if (x > 1940 || x < MAX_YEAR){
			year = x;
		}else if(x < 1940 || x > MAX_YEAR){
			year = MAX_YEAR;
		}
	}
	public int getYear(){
		return year;
	}
	//Maker MPG
	public void setMakempg(double x){
		makempg = x;
	}
	public double getMakempg(){
		return makempg;
	}
	//True MPG
	public void setTruempg(double x){
		truempg = x;
	}
	public double getTruempg(){
		return truempg;
	}
	//True MPD
	public void setTruempd(double x){
		truempd = x;
	}
	public double getTruempd(){
		return truempd;
	}
	//End Attribute Sets and Gets
	
	//Constructors
	//Default Constructor
	public Car(){
		year = MAX_YEAR;
		makempg = 1;
	}
	//Constructor with ALL Attributes
	public Car(String makex, String modelx, int yearx, double makempgx){
		make = makex;
		model = modelx;
		year = yearx;
		makempg = makempgx;
	}
	//End Constructors
	
	//toString Method
	public String toString(){
		return "Year= " + year + ", Make= " + make + ", Model= " + model + ", MakerMPG= " + makempg + ", TrueMPD= " + truempd + ", TrueMPG= " + truempg;
	}
	//End toString Method
}
