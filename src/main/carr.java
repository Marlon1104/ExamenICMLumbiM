package main;

public class carr {

	private String Modelo;
	private String Modelo2;
	private String Modelo3;
	private String Modelo4;
	private String Modelo5;
	private short years;
	private int chasis;
	private short  placa;
	
		

	public carr() {
		Modelo = "Toyota";
		Modelo2 = "Hyundai";
		Modelo3 = "Mazda";
		Modelo4 = "Nissan";
		Modelo5 = "Kia";
	}
	
	public String getModelo2() {
		return Modelo2;
	}
	public void setModelo2(String modelo2) {
		Modelo2 = "Hyundai";
	}
	public String getModelo3() {
		return Modelo3;
	}
	public void setModelo3(String modelo3) {
		Modelo3 = "Mazda";
	}
	public String getModelo4() {
		return Modelo4;
	}
	public void setModelo4(String modelo4) {
		Modelo4 = "Nissan";
	}
	public String getModelo5() {
		return Modelo5;
	}
	public void setModelo5(String modelo5) {
		Modelo5 = "kia";
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getYears() {
		return years;
	}
	public void setYears(short years) {
		this.years = years;
	}
	public int getChasis() {
		return chasis;
	}
	public void setChasis(int chasis) {
		this.chasis = chasis;
	}
	public int getPlaca() {
		return placa;
	}
	public void setPlaca(short placa) {
		this.placa = placa;
	}
}
