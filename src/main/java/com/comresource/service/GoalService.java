package com.comresource.service;

import java.util.List;

import com.comresource.model.Goal;
import com.comresource.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();


	
}
