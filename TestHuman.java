package com.Santana.objectMasterpt1;

public class TestHuman {

	public static void main(String[] args) {
		Human alex = new Human();
		Human bob = new Human();
		alex.showHealth();
		bob.showHealth();
		alex.attack(bob);
		bob.showHealth();

	}

}
