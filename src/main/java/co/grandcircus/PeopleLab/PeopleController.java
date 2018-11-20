package co.grandcircus.PeopleLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.PeopleLab.model.Complete;
import co.grandcircus.PeopleLab.model.Tinys;

@Controller
public class PeopleController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Tinys> tinys = apiService.getTinyPeople();
		// Collections.sort(tinys, new OrganizeByYear());
		tinys.sort((tiny1, tiny2) -> tiny1.getYear().compareTo(tiny2.getYear()));
		return new ModelAndView("index", "tinys", tinys);
	}

	@RequestMapping("/complete")
	public ModelAndView completePeople() {
		List<Complete> completes = apiService.getCompletePeople();
		// Collections.sort(completes, new OrganizeCompleteByYear());
		completes.sort((complete1, complete2) -> complete1.getYear().compareTo(complete2.getYear()));
		return new ModelAndView("complete", "completes", completes);
	}

}
