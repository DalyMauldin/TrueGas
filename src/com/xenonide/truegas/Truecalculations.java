package com.xenonide.truegas;

public class Truecalculations{

	public double truempg(int mileage,int newmileage, double gallonsbought){
		return (newmileage - mileage) / gallonsbought;
	}
	
	public double truempd(double ppg, double truempg){
		return truempg / ppg;
	}
	
	public double makermpd(double ppg, double makermpg){
		return Math.round((makermpg / ppg)*100.0)/100.0;
	}
}
