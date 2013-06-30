package com.pluralsight.model;

public class GoalReport {
	
	
	private int goalMinutes;
	
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	
	// =--------------------------------
	
	private int exerciseMinutes;
	
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}

	// =--------------------------------	
	
	
	private String exerciseActivity;
	
	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	
	// =================================
	
	public GoalReport (int goalMunutes, int exerciseMinutes, String exerciseActivity){
		
		this.goalMinutes = goalMunutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}
	

}
