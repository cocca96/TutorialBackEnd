package com.backEndTutorial.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.backEndTutorial.model.Hero;

public class StatisticsDto {
	public List<String> labels;
	public List<Integer> scores;
	
	public StatisticsDto(List<String> labels, List<Integer> scores) {
		
		this.scores = scores;
	}
	
	public StatisticsDto() {
		this.labels = new ArrayList<String>();
		this.scores = new ArrayList<Integer>();
	}
	public void addItem(String year, int score) {
		this.labels.add(year);
		this.scores.add(score);
	}
	public void addLabel(String name) {
		this.labels.add(name);
	}
	public void addScore(int value) {
		this.scores.add(value);
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}
	
}
