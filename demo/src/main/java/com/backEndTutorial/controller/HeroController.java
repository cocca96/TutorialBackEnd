package com.backEndTutorial.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.backEndTutorial.dto.StatisticsDto;
import com.backEndTutorial.model.Hero;
import com.backEndTutorial.model.HeroInterface;
import com.backEndTutorial.service.HeroService;
import com.backEndTutorial.service.HeroServiceInterface;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class HeroController {
	private HeroServiceInterface heroService;
	@Autowired
	public HeroController(HeroServiceInterface heroService) {
		this.heroService=heroService;
		
	}
	
	@PostMapping(value="/hero")
	public void insertHero(@RequestBody Hero hero) {
		try {
			heroService.addHero(hero);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"this id already exists");
			
		}
		
	}
	@GetMapping(value="/hero", produces = "application/json")
	public Collection<HeroInterface> getHeroes(){
		return heroService.getHeroes();
	}
	
	@GetMapping(value="/hero/{id}/stats/{firstYear}/{secondYear}")
	public StatisticsDto getHeroStats(@PathVariable("id")int id,@PathVariable("firstYear") int firstYear,@PathVariable("secondYear") int secondYear){		
		try {
			return heroService.getHeroStats(id, firstYear,secondYear);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	@DeleteMapping(value="/hero/{id}")
	public void deleteHero(@PathVariable("id") int idHero) {
		try {
			heroService.deleteHero(idHero);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"this hero doesn't exist");
			
		}
	}
	@GetMapping(value="/hero/{id}")
	public HeroInterface getHero(@PathVariable("id") int idHero) {
		try {
			return heroService.getHero(idHero);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"hero not found");
			
		}
	}
	@PatchMapping(value = "/hero")
	public void updateStudent(@RequestBody Hero hero) {
		heroService.update(hero);
	}
	

}
