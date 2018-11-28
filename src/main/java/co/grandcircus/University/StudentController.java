package co.grandcircus.University;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.University.dao.UserDao;
import co.grandcircus.University.entity.Enroll;
import co.grandcircus.University.entity.User;

@Controller
public class StudentController {

	@Autowired
	private UserDao userDao;

	// needs to be fixed//
	@RequestMapping("/student-courses")
	public ModelAndView home(@SessionAttribute("user") User user) {
		List<Enroll> myCourses = userDao.findMyClass(user.getId());
		return new ModelAndView("student-courses", "myCourses", myCourses);
	}
}
