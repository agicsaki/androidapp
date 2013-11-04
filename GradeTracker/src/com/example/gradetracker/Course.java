package com.example.gradetracker;
import com.example.gradetracker.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name = ""; // Name of this course
	private int goalGrade; // Goal percentage for this course
	private int currentGrade = 0; // Calculated current Grade for this course
	
	ArrayList<Assignment> myAssignments = new ArrayList<Assignment>(); // List of Assignments for this course
	
	/** Creates a new Course with Name n */	
	public Course(String n) {
		name = n;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGoalGrade(int g) {
		goalGrade = g;
	}
	
	public void addAssignment(Assignment a) {
		myAssignments.add(a);
	}
	
	public void calculateCurrentGrade() {
		for (Assignment a : myAssignments) {
			currentGrade += a.getWeightedGrade();
		}
	}
	
	
	
	
	
}
