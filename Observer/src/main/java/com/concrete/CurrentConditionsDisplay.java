package com.concrete;

import com.model.DisplayElement;
import com.model.Observer;
import com.model.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
    private Subject weatherData;
	
	

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current Conditions : "+temperature+" F degrees and  "+humidity+" % humidity");
		
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
