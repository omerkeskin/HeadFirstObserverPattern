package com.concrete;

import java.util.ArrayList;

import com.model.Observer;
import com.model.Subject;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	

	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	public void notifyObservers() {
		for(Observer obs : observers) {
			obs.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	
	public void setMeasurements(float temperature, float humidity , float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	

}
