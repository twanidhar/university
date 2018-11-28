package co.grandcircus.University.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enroll {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String grade;

	@ManyToOne
	private Student student;

	@ManyToOne
	private Course course;
	private String semester;

	public Enroll() {
	}

	public Enroll(Long id, String grade, Student student, Course course, String semester) {
		this.id = id;
		this.grade = grade;
		this.student = student;
		this.course = course;
		this.semester = semester;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Enroll [id=" + id + ", grade=" + grade + ", student=" + student + ", course=" + course + ", semester="
				+ semester + "]";
	}

}
