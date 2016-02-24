package com.xenonide.truegas;

public class Truecalculations{

	public double truempg(int mileage,int newmileage, double gallonsbought){
		return Math.round(((newmileage - mileage) / gallonsbought)*100.0)/100.0;
		
	}
	
	public double truempd(double ppg, double truempg){
		return Math.round((truempg / ppg)*100.0)/100.0;
	}
	
	public double makermpd(double ppg, double makermpg){
		return Math.round((makermpg / ppg)*100.0)/100.0;
	}
}
