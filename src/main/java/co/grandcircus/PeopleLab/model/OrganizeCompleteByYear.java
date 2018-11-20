package co.grandcircus.PeopleLab.model;

import java.util.Comparator;

public class OrganizeCompleteByYear implements Comparator<Complete> {

	@Override
	public int compare(Complete a, Complete b) {
		return a.getYear() - b.getYear();
	}

}
