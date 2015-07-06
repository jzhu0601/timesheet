package com.comresource.service;

import java.util.List;

import com.comresource.model.Activity;
import com.comresource.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}