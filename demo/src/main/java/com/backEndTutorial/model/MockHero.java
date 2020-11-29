package com.backEndTutorial.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@CrossOrigin
public class MockHero {
	List<HeroInterface> listHeroes = new ArrayList<HeroInterface>(
			Arrays.asList(new Hero("Craki", 1), new Hero("Craki", 2)));
	List<PunteggioAnno> idPunteggio = new ArrayList<PunteggioAnno>();

	public List<HeroInterface> getListHeroes() {
		return listHeroes;
	}

	public PunteggioAnno getPunteggio(int id, int year) throws Exception {

		idPunteggio.add(new PunteggioAnno(1, 13, 2010));
		idPunteggio.add(new PunteggioAnno(1, 14, 2011));
		idPunteggio.add(new PunteggioAnno(1, 15, 2012));
		idPunteggio.add(new PunteggioAnno(1, 16, 2013));
		idPunteggio.add(new PunteggioAnno(1, 17, 2014));
		idPunteggio.add(new PunteggioAnno(1, 18, 2015));
		idPunteggio.add(new PunteggioAnno(1, 19, 2016));
		idPunteggio.add(new PunteggioAnno(2, 12, 2011));
		idPunteggio.add(new PunteggioAnno(2, 15, 2012));
		idPunteggio.add(new PunteggioAnno(2, 189, 2013));
		idPunteggio.add(new PunteggioAnno(2, 13, 2014));
		idPunteggio.add(new PunteggioAnno(2, 10, 2015));
		idPunteggio.add(new PunteggioAnno(2, 13, 2016));
		idPunteggio.add(new PunteggioAnno(2, 18, 2017));
		idPunteggio.add(new PunteggioAnno(2, 13, 2018));
		
		PunteggioAnno item = idPunteggio.stream().filter(x -> x.getId()== id && x.getAnno()==year).findFirst().orElseThrow(() -> new Exception());
		
		
		return item;

	}

	public MockHero() {

	}

	public void addHero(HeroInterface hero) throws Exception {
		for (HeroInterface hero1 : listHeroes) {
			if (hero1.getHero() == hero.getHero()) {
				throw new Exception();
			}
		}
		listHeroes.add(hero);

	}

	public void deleteHero(int idHero) throws Exception {
		int savedHeroId = 0;
		for (HeroInterface hero : listHeroes) {
			if (hero.getHero() == idHero) {
				listHeroes.remove(hero);
				savedHeroId = hero.getHero();
				break;

			}
		}
		if (savedHeroId == 0) {
			throw new Exception();
		}

	}

	public void updateHero(HeroInterface h) {
		for (HeroInterface hero : listHeroes) {
			if (hero.getHero() == h.getHero()) {
				hero.setName(h.getName());

				break;

			}
		}

	}

}
