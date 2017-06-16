package com.edu.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.edu.model.NoSuchResourceException;
import com.edu.model.Stadium;
import com.edu.model.Team;


@Repository
public class StadiumDao implements IStadiumDao{
	
	private static int idCount = 1;
	private Map<Integer, Stadium> stadiums = new HashMap<>();
	
	
	

	public StadiumDao() {
		
		add(new Stadium("eden garden","kolkata","west Bengal"));
		add(new Stadium("lords","london","england"));
		add(new Stadium("uppal","hyderabad","telangana"));
	}
	
	
	@Override
	public List<Stadium> getAll() {
		
		
		return new ArrayList<Stadium>(stadiums.values());
	}
	@Override
	public void add(Stadium stadium) {
		
		stadium.setStadiumKey(idCount);
		
		stadiums.put(idCount,stadium);
	
		idCount++;
		
	}

	@Override
	public Stadium get(int stadiumKey) {
		
		Stadium s1 = stadiums.get(stadiumKey);

		if (s1 == null) {

			throw new NoSuchResourceException("Stadium", stadiumKey);
		}

		return s1;
	}

	@Override
	public void update(int stadiumKey, Stadium stadium) {
		
		stadiums.put(stadiumKey, stadium);
		
	}

	@Override
	public void delete(int stadiumKey) {
		

		Stadium s2 = stadiums.remove(stadiumKey);

		if (s2 == null) {

			throw new NoSuchResourceException("Stadium", stadiumKey);
		}
		
	}

	

}
