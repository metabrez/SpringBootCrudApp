package com.edu.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.edu.model.NoSuchResourceException;
import com.edu.model.Team;

@Repository
public class TeamDao implements ITeamDao {

	private static int idCount = 1;

	// private List<Team> listTeam2 = new ArrayList<>();
	private Map<Integer, Team> teams = new HashMap<>();

	public TeamDao() {

		add(new Team("Chelsea", "london", "mascot", "red", "green"));
		add(new Team("liverpool", "london", "mascot", "red", "green"));
		add(new Team("real madrid", "espain", "mascot", "green", "white"));

	}

	@Override
	public List<Team> getAll() {
		return new ArrayList<Team>(teams.values());
	}

	@Override
	public void add(Team team) {

		team.setTeamKey(idCount);

		teams.put(idCount, team);

		idCount++;

	}

	@Override
	public Team get(int id) {

		Team t1 = teams.get(id);

		if (t1 == null) {

			throw new NoSuchResourceException("Team", id);
		}

		return t1;
	}

	@Override
	public void update(int teamKey, Team team) {

		teams.put(teamKey, team);
	}

	@Override
	public void delete(int teamKey) {

		Team t2 = teams.remove(teamKey);

		if (t2 == null) {

			throw new NoSuchResourceException("Tean", teamKey);
		}

	}

}
