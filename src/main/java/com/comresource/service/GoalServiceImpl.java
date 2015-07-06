package com.comresource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comresource.model.Goal;
import com.comresource.model.GoalReport;
import com.comresource.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
	
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
		 
	}

	public List<GoalReport> findAllGoalReports() {
		// TODO Auto-generated method stub
		return goalRepository.findAllGoalReports();
	}

}
