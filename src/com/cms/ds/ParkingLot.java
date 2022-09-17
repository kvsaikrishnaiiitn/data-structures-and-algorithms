package com.cms.ds;

import java.util.ArrayList;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Hello, World!");
		strings.add("Welcome to CoderPad.");
		strings.add("This pad is running Java " + Runtime.version().feature());

		for (String string : strings) {
			System.out.println(string);
		}
	}
}

class ParkingLot {

	int totalBikeSpots;
	int totalCarSpots;
	int totalVanSpots;

	int remainingBikeSpots;
	int remainingCarSpots;
	int remainingVanSpots;

	ParkingLot(int totalBikeSpots, int totalCarSpots, int totalVanSpots) {
		this.totalBikeSpots = totalBikeSpots;
		this.totalCarSpots = totalCarSpots;
		this.totalVanSpots = totalVanSpots;
		this.remainingBikeSpots = totalBikeSpots;
		this.remainingCarSpots = totalCarSpots;
		this.remainingVanSpots = totalVanSpots;
	}

	ArrayList<ParkingSpot> bikeSpots;
	ArrayList<ParkingSpot> carSpots;
	ArrayList<ParkingSpot> vanSpots;

	int totalSpotsRemaining() {
		return 100;
	}

	int totalSpots() {
		return 50;
	}

	boolean isFull() {
		return true;
	}

	boolean isEmpty() {
		return true;
	}

	boolean areSpotsFull(VehicleType vehicleType) {
		return true;
	}

	int totalVansSpots() {
		return 100;
	}

	boolean parkVehicle(Vehicle vehicle) {
		boolean parkedVehicle = false;
		if (vehicle.vehicleType.equals(VehicleType.BIKE)) {
			if (remainingBikeSpots > 0) {
				ParkingSpot parkingSpot = new ParkingSpot(vehicle.vehicleType, vehicle);
				bikeSpots.add(parkingSpot);
				parkedVehicle = true;
				remainingBikeSpots--;
			}
		}
		return parkedVehicle;
	}

}

class ParkingSpot {
	VehicleType vehicleType;
	Vehicle vehicle;

	ParkingSpot(VehicleType vehicleType, Vehicle vehicle) {
		this.vehicleType = vehicleType;
		this.vehicle = vehicle;
	}
}

class Vehicle {
	String vehicleNumber;
	VehicleType vehicleType;
}

enum VehicleType {
	BIKE, CAR, VAN
}
