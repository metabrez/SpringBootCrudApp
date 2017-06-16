package com.edu.model;

import java.util.Date;

public class TournamentMatch extends Match {
	
	public TournamentMatch(Date date, Date startTime, Stadium stadium, int homeScore, int visitorScore,
			Team visitorTeam, Team homeTeam) {
		super(date, startTime, stadium, homeScore, visitorScore, visitorTeam, homeTeam);
		// TODO Auto-generated constructor stub
	}
	private int homePoints;
	private int visitorPoints;
	public int getHomePoints() {
		return homePoints;
	}
	public void setHomePoints(int homePoints) {
		this.homePoints = homePoints;
	}
	public int getVisitorPoints() {
		return visitorPoints;
	}
	public void setVisitorPoints(int visitorPoints) {
		this.visitorPoints = visitorPoints;
	}

	

}
