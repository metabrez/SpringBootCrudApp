package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.model.Team;
import com.edu.service.TeamService;

@Controller
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = { "/", "/teams" }, method = RequestMethod.GET)
	public String getAll(Model model) {

		List<Team> t = teamService.getAll();
		model.addAttribute("teamListKey", t);

		return "teamList";

	}

	@RequestMapping(value = "/teams", method = RequestMethod.POST)
	public String addTeam(Team team) {

		teamService.add(team);

		return "redirect:/teams";

	}

	@RequestMapping(value = "/teams/{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id, Model model) {

		model.addAttribute("team", teamService.get(id));

		return "teamDetails";

	}

	@RequestMapping(value = "/teams/{id}", method = RequestMethod.POST)
	public String update(@PathVariable("id") int teamKey, Team team) {
		team.setTeamKey(teamKey);
		teamService.update(teamKey, team);

		return "redirect:/teams";
	}

	@RequestMapping(value = "/teams/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id, Team team) {

		teamService.delete(id);

		return "redirect:/teams";

	}

}
