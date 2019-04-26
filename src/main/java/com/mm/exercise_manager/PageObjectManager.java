package com.mm.exercise_manager;

import org.openqa.selenium.WebDriver;

import com.mm.exercise.pageobjects.ExercisePage;
import com.mm.exercise.utils.BaseClass;

public class PageObjectManager extends BaseClass {
	private ExercisePage exercisePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public ExercisePage getexercisePage() {
		return (exercisePage == null) ? exercisePage = new ExercisePage(driver) : exercisePage;

	}
}
