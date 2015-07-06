package com.comresource.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.comresource.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImple implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Exercise save(Exercise exercise) {
		
		em.persist(exercise);
		em.flush();
		return null;
	}

}
