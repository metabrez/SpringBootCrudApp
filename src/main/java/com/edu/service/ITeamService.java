package com.edu.service;

import java.util.List;

import com.edu.model.Team;

public interface ITeamService {
	public abstract List<Team> getAll();

	public abstract void add(Team team);

	public abstract Team get(int id);

	public abstract void update(int teamKey, Team team);

	public abstract void delete(int teamKey);

}
