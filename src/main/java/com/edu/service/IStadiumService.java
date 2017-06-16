package com.edu.service;

import java.util.List;

import com.edu.model.Stadium;

public interface IStadiumService {
	
	public abstract List<Stadium> getAll();
	public abstract void add(Stadium stadium);

	public abstract Stadium get(int stadiumKey);

	public abstract void update(int stadiumKey, Stadium stadium);

	public abstract void delete(int stadiumKey);

}
