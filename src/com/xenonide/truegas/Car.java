package com.xenonide.truegas;

public class Car extends Truecalculations {
	//Car Attributes
	private String make;
	private String model;
	private int year;
	private double makempg;
	private double makempd;
	private double truempg;
	private double truempd;
	private int mileage;
	private double tanksize;
	//End Car Attributes
	
	//Final Values
	private final int MAX_YEAR = 2017;
	private final int MAX_MILEAGE = 500000;
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
		if (x >= 1940 && x <= MAX_YEAR){
			year = x;
		}else if (x < 1940 || x > MAX_YEAR){
			year = MAX_YEAR;
		}
	}
	public int getYear(){
		return year;
	}
	//Maker MPG
	public void setMakempg(double x){
		if (x > 0){
			makempg = x;
		}else if (x <= 0){
			makempg = 1;
		}
	}
	public double getMakempg(){
		return makempg;
	}
	//Maker MPD
	public void setMakempd(double ppg){
		if (ppg > 0){
			makempd = makermpd(ppg, makempg);
		}else if (ppg < 0){
			makempd = 1;
		}
	}
	public double getMakempd(){
		return makempd;
	}
	//True MPG
	public void setTruempg(int newmiles, double gallonsbought){
		if (newmiles > mileage && gallonsbought <= tanksize){
			truempg = truempg(mileage, newmiles, gallonsbought);
		}else if (newmiles < mileage || gallonsbought > tanksize){
			truempg = 1;
		}
	}
	public double getTruempg(){
		return truempg;
	}
	//True MPD
	public void setTruempd(double ppg){
		if (ppg > 0){
			truempd = truempd(ppg, truempg);
		}else if (ppg < 0) {
			truempd = 1;
		}
	}
	public double getTruempd(){
		return truempd;
	}
	//Mileage
	public void setMileage(int x){
		if (x > 0 && x < MAX_MILEAGE){
			mileage = x;
		}else if (x <= 0){
			mileage = MAX_MILEAGE;
		}
	}
	public int getMileage(){
		return mileage;
	}
	//Tank Size
	public void setTanksize(double x){
		if (x > 0){
			tanksize = x;
		} else if (x < 0){
			tanksize = 1;
		}
	}
	public double getTanksize(){
		return tanksize;
	}
	//End Attribute Sets and Gets
	
	//Constructors
	//Default Constructor
	public Car(){
		year = MAX_YEAR;
		makempg = 1;
		mileage = MAX_MILEAGE;
	}
	//Constructor with ALL Attributes
	public Car(String makex, String modelx, int yearx, double makempgx, int mileagex, double ppgx, int newmilesx, double gallonsboughtx, double tanksizex){
		setMake(makex);
		setModel(modelx);
		setYear(yearx);
		setMileage(mileagex);
		setTanksize(tanksizex);
		setMakempg(makempgx);
		setMakempd(ppgx);
		setTruempg(newmilesx, gallonsboughtx);
		setTruempd(ppgx);
	}
	//End Constructors
	
	//toString Method
	public String toString(){
		return "Year= " + year + ", Make= " + make + ", Model= " + model + ", Mileage= " + mileage + " miles, MakeMPD= " + makempd + " mpd, MakerMPG= " + makempg + " mpg, TrueMPD= " + truempd + " mpd, TrueMPG= " + truempg + " mpg";
	}
	//End toString Method
}
