package com.example.gradetracker;

public class Assignment {

	private String name = ""; // Name of this Assignment
	private int weight; // Percentage weight of this Assignment, [0,100]
	private int earnedGrade; // Grade earned for this Assignment
	private int suggestedGrade; // Suggested grade for this assignment
		
	/** Creates a new Assignment with Name n */	
	public Assignment(String n) {
		name = n;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setEarnedGrade(int g) {
		earnedGrade = g;
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void calculateSuggestedGrade() {
		// retrieve list
		
	}
	
	public int getWeightedGrade() {
		if (earnedGrade != 0) {
			return earnedGrade * (weight / 100);
		}
		return suggestedGrade * (weight / 100);
	}
	
	
	
	
	
}
