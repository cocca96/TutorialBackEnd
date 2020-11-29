package com.backEndTutorial.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEndTutorial.dto.StatisticsDto;
import com.backEndTutorial.model.Hero;
import com.backEndTutorial.model.HeroInterface;
import com.backEndTutorial.model.MockHero;
import com.backEndTutorial.model.PunteggioAnno;

@Service
public class HeroService implements HeroServiceInterface {
	private MockHero hero;

	@Autowired
	public HeroService(MockHero hero) {
		this.hero = hero;

	}

	@Override
	public Collection<HeroInterface> getHeroes() {
		return hero.getListHeroes();
	}

	public void addHero(Hero hero1) throws Exception {
		hero.addHero(hero1);
	}

	@Override
	public void deleteHero(int idHero) throws Exception {
		hero.deleteHero(idHero);

	}

	@Override
	public HeroInterface getHero(int idHero) throws Exception {
		HeroInterface hero1 = hero.getListHeroes().stream().filter(i -> i.getHero() == idHero).findFirst()
				.orElseThrow(() -> new Exception());
		return hero1;
	}

	@Override
	public void update(HeroInterface hero1) {
		hero.updateHero(hero1);

	}

	@Override
	public StatisticsDto getHeroStats(int id, int firstYear, int secondYear) throws Exception {
		
		StatisticsDto stats = new StatisticsDto();
		PunteggioAnno item = hero.getPunteggio(id, firstYear);
		stats.addItem(""+item.getAnno(), item.getPunteggio());
		item = hero.getPunteggio(id, secondYear);
		stats.addItem(""+item.getAnno(), item.getPunteggio());
		
		
		return stats;
	}

}
