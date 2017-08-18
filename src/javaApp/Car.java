package javaApp;

public class Car {

	String carNo;
	int speed;
	double weight;
	
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Car(String carNo,int speed,double weight) {
		this.carNo=carNo;
		this.speed=speed;
		this.weight=weight;
	}
	public void addSpeed(){
		speed++;
	}
	public void cutSpeed(){
		speed--;
	}
	public void updateCarNo(){
		
	}
	public double weight(){
		return weight;
	}
	
	
	
	
}
