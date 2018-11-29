package co.grandcircus.University;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.University.dao.UserDao;
import co.grandcircus.University.entity.Enroll;
import co.grandcircus.University.entity.User;

@Controller
public class StudentController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/student-courses")
	public ModelAndView studentHome(@SessionAttribute("user") User user) {
		List<Enroll> myCourses = userDao.findMyClasses(user.getId());
		return new ModelAndView("student-courses", "myCourses", myCourses);
	}

	// fix -- no entity found
	@RequestMapping("/student/Mycourse")
	public ModelAndView studentCourse(@RequestParam("id") Long id) {
		Enroll myCourse = userDao.findMyClass(id);
		// System.out.println(myCourse.getCourse().getId());
		return new ModelAndView("student-course", "myCourse", myCourse);
	}
}
