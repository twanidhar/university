package co.grandcircus.University;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.University.dao.AdminDao;
import co.grandcircus.University.entity.Course;

@Controller
public class AdminController {

	@Autowired
	private AdminDao adminDao;

	@RequestMapping("/admin/courses")
	public ModelAndView home() {
		List<Course> courses = adminDao.findCourses();
		return new ModelAndView("index");
	}

}
