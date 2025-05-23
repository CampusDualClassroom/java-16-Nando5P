package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		// Metodos de avion
		plane.start();
		plane.fly();
		plane.takeOff();
		plane.land();
		plane.stop();
		plane.maintenance();

		// Metodos de tractor
		tractor.start();
		tractor.forward();
		tractor.backward();
		tractor.stop();
		tractor.maintenance();

	}

}
