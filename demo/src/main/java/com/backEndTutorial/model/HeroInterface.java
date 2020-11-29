package com.backEndTutorial.model;

import com.backEndTutorial.dto.StatisticsDto;

public interface HeroInterface {
	int getHero();
	void setName(String name);
	String getName();
	StatisticsDto getStatisticDto();
	
	

}
