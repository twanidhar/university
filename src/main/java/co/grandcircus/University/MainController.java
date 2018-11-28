package co.grandcircus.University;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.University.dao.UserDao;
import co.grandcircus.University.entity.User;

@Controller
public class MainController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@PostMapping("/")
	public ModelAndView postIndex(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {

		User user = userDao.findByEmail(email);

		if (user == null) {
			return new ModelAndView("login", "message", "Incorrect username or password");
		}
		if (!user.getPassword().equals(password)) {
			return new ModelAndView("login", "message", "Incorrect username or password");
		}

		if (user.isAdmin()) {

		}

		// fix return
		return null;
	}

}
