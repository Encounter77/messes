package bookP143T13;

public class Vehicle {
	private double speed;
	private String name;
	private String color;
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void start(){
		System.out.println("Now is starting!");
	}
	
	public void stop(){
		System.out.println("Now is stopping!");
	}
	
	public void run(){
		System.out.println("Now is running!");
	}
}

