package co.grandcircus.University.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.University.entity.Course;
import co.grandcircus.University.entity.Enroll;
import co.grandcircus.University.entity.Student;
import co.grandcircus.University.entity.User;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	EntityManager em;

	public List<Enroll> findMyClass(Long id) {
		return em.createQuery("From Enroll WHERE id = :id", Enroll.class).setParameter("id", id).getResultList();
	}

	public User findByEmail(String email) {
		return em.createQuery("From User WHERE email = :email", User.class).setParameter("email", email)
				.getSingleResult();
	}
	
	public List<Course> findCourses() {
		return em.createQuery("From Course", Course.class).getResultList();
	}

	public List<Student> findStudents() {
		return em.createQuery("From Student", Student.class).getResultList();
	}

}
