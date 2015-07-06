package com.comresource.repository;

import java.util.List;

import com.comresource.model.Goal;
import com.comresource.model.GoalReport;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();
	
}
