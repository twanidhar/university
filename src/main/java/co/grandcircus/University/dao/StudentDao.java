package co.grandcircus.University.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.University.entity.Enroll;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	EntityManager em;

	public List<Enroll> findMyClass(Long id) {
		return em.createQuery("From Enroll WHERE id = :id", Enroll.class).setParameter("id", id).getResultList();
	}

}
