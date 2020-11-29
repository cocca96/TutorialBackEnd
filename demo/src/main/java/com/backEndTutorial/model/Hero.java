package com.backEndTutorial.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.backEndTutorial.dto.StatisticsDto;
@Component
public class Hero implements HeroInterface{
	private String name;
	private int id;
	private int scoreLastYear=10;
	private int scoreThisYear=22;
	private List<Integer> scoreLast10Years=new ArrayList<Integer>();
	private StatisticsDto statisticDto;

	
	@Override
	public StatisticsDto getStatisticDto() {
		return statisticDto;
	}

	public List<Integer> getScoreLast10Years() {
		return scoreLast10Years;
	}

	public void setScoreLast10Years(List<Integer> scoreLast10Years) {
		this.scoreLast10Years = scoreLast10Years;
	}

	public int getScoreLastYear() {
		return scoreLastYear;
	}

	public void setScoreLastYear(int scoreLastYear) {
		this.scoreLastYear = scoreLastYear;
	}

	public int getScoreThisYear() {
		return scoreThisYear;
	}

	public void setScoreThisYear(int scoreThisYear) {
		this.scoreThisYear = scoreThisYear;
	}

	public Hero(String name, int id) {
		this.name = name;
		this.id = id;
		scoreLast10Years.add(12);
		scoreLast10Years.add(30);
		scoreLast10Years.add(10);
		scoreLast10Years.add(20);
		
		this.statisticDto = new StatisticsDto();
	}

	public String getName() {
		return name;
	}

	public Hero() {
		
		
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public int getHero() {
		return this.id;
		
	}


	
	
	
	

}
