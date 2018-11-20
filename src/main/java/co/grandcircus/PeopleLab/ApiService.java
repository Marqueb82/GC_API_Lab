package co.grandcircus.PeopleLab;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.PeopleLab.model.Complete;
import co.grandcircus.PeopleLab.model.PeopleResponse;
import co.grandcircus.PeopleLab.model.Tinys;

@Component
public class ApiService {

	RestTemplate restTemplate = new RestTemplate();

	public List<Tinys> getTinyPeople() {

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		PeopleResponse response = restTemplate.getForObject(url, PeopleResponse.class);

		return response.getTiny();

	}

	public List<Complete> getCompletePeople() {

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		PeopleResponse response = restTemplate.getForObject(url, PeopleResponse.class);

		return response.getComplete();

	}

}
