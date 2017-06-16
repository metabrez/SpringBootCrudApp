package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.StadiumDao;
import com.edu.model.Stadium;

@Service
public class StadiumService implements IStadiumService {

	@Autowired
	private StadiumDao stadiumDao;

	@Override
	public List<Stadium> getAll() {

		return stadiumDao.getAll();

	}

	@Override
	public void add(Stadium stadium) {

		stadiumDao.add(stadium);

	}

	@Override
	public Stadium get(int stadiumKey) {

		return stadiumDao.get(stadiumKey);
	}

	@Override
	public void update(int stadiumKey, Stadium stadium) {

		stadiumDao.update(stadiumKey, stadium);

	}

	@Override
	public void delete(int stadiumKey) {

		stadiumDao.delete(stadiumKey);
	}

}
