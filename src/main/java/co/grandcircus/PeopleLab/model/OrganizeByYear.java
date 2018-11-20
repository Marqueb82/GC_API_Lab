package co.grandcircus.PeopleLab.model;

import java.util.Comparator;

public class OrganizeByYear implements Comparator<Tinys> {

	@Override
	public int compare(Tinys a, Tinys b) {
		return a.getYear() - b.getYear();
	}

}
