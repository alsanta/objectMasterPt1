package com.Santana.objectMasterpt1;

public class Human {
//	Member Variable
	private int strenght;
	private int stealth;
	private int intelligence;
	private int health;
	
//	constructor
	public Human(){
		this.strenght = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public void attack(Human human) {
		human.health -= this.strenght;
	}
	
	public void showHealth() {
		System.out.println(this.health);
	}

}
