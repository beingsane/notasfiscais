package br.com.jsfcdi.treinamento.model.bean;

public class Car {
	private String model;
	private int year;
	private String color;
	private String manufacturer;

	public Car(String model, int year, String color, String manufacturer) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}
