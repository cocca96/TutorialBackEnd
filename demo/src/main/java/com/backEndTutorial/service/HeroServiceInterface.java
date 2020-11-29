package com.backEndTutorial.service;

import java.util.Collection;

import com.backEndTutorial.dto.StatisticsDto;
import com.backEndTutorial.model.Hero;
import com.backEndTutorial.model.HeroInterface;

public interface HeroServiceInterface {
	Collection<HeroInterface> getHeroes();
	void addHero(Hero hero) throws Exception;
	void deleteHero(int idHero) throws Exception;
	HeroInterface getHero(int idHero) throws Exception;
	void update(HeroInterface hero);
	StatisticsDto getHeroStats(int id, int firstYear, int secondYear) throws Exception;

}
