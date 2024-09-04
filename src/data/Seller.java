package data;

public class Seller {
	private String name;
	private double totalSalles;
	private int lenghService;
	private char category;
	
	
	private static double wage = 1500;
	
	public void Seller(String name, int lenghService) {
		
		this.name = name;
		this.lenghService = lenghService;
		this.setCategory();
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLenghtService(int time_service) {
		this.lenghService = time_service;
	}
	
	private void setCategory() {
		
		if(this.lenghService > 60) {
			this.category = 'A';
		} else if (this.lenghService > 30 && this.lenghService <= 60) {
			this.category = 'B';
		} else {
			this.category = 'C';
		}
	}
	
	public Double getComission() {
		if (this.totalSalles > 20000) {
			return this.totalSalles*0.2;
		} else if (this.totalSalles < 10000) {
			return this.totalSalles*0.05;
		} else {
			return this.totalSalles*0.1;
		}
	}
	
	
	
}
