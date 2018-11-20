package co.grandcircus.PeopleLab.model;

import java.util.List;

public class PeopleResponse {

	private List<Complete> complete;
	private List<Tinys> tiny;

	public List<Complete> getComplete() {
		return complete;
	}

	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}

	public List<Tinys> getTiny() {
		return tiny;
	}

	public void setTiny(List<Tinys> tiny) {
		this.tiny = tiny;
	}
}
