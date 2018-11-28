package co.grandcircus.University.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.University.entity.Course;
import co.grandcircus.University.entity.Student;

@Repository
@Transactional
public class AdminDao {

	@PersistenceContext
	EntityManager em;

	public List<Course> findCourses() {
		return em.createQuery("From Course", Course.class).getResultList();
	}

	public List<Student> findStudents() {
		return em.createQuery("From Student", Student.class).getResultList();
	}

}
