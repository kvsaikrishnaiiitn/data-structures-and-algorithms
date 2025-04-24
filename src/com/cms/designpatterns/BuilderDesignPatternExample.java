package com.cms.designpatterns;

import com.cms.designpatterns.Computer.Builder;

public class BuilderDesignPatternExample {
	public static void main(String[] args) {
		// Creating a basic computer with mandatory parameters
		Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD").build();

		// Creating a computer with all optional parameters
		Computer fullComputer = new Computer.Builder("Intel i9", "32GB", "1TB NVMe").graphicsCard("NVIDIA RTX 3080")
				.hasWifi(true).hasBluetooth(true).build();

		// Creating a computer with some optional parameters
		Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB", "500GB SSD")
				.graphicsCard("AMD Radeon RX 6700 XT").hasWifi(false).build();

		System.out.println("Basic Computer: " + basicComputer);
		System.out.println("Full Computer: " + fullComputer);
		System.out.println("Gaming Computer: " + gamingComputer);
	}
}

class Computer {
	private String cpu;
	private String ram;
	private String storage;
	private String graphicsCard;
	private boolean hasWifi;
	private boolean hasBluetooth;

	// Private constructor to enforce the use of the builder
	private Computer(String cpu, String ram, String storage, String graphicsCard, boolean hasWifi,
			boolean hasBluetooth) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
		this.graphicsCard = graphicsCard;
		this.hasWifi = hasWifi;
		this.hasBluetooth = hasBluetooth;
	}

	// Getters (no setters to make the object effectively immutable after creation)
	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getStorage() {
		return storage;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public boolean hasWifi() {
		return hasWifi;
	}

	public boolean hasBluetooth() {
		return hasBluetooth;
	}

	@Override
	public String toString() {
		return "Computer{" + "cpu='" + cpu + '\'' + ", ram='" + ram + '\'' + ", storage='" + storage + '\''
				+ ", graphicsCard='" + graphicsCard + '\'' + ", hasWifi=" + hasWifi + ", hasBluetooth=" + hasBluetooth
				+ '}';
	}

	// Static nested Builder class
	public static class Builder {
		private String cpu;
		private String ram;
		private String storage;
		private String graphicsCard;
		private boolean hasWifi = false; // Optional, default to false
		private boolean hasBluetooth = false; // Optional, default to false

		public Builder(String cpu, String ram, String storage) {
			// Mandatory parameters in the constructor of the Builder
			this.cpu = cpu;
			this.ram = ram;
			this.storage = storage;
		}

		public Builder graphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this; // Returning 'this' allows for method chaining (fluent interface)
		}

		public Builder hasWifi(boolean hasWifi) {
			this.hasWifi = hasWifi;
			return this;
		}

		public Builder hasBluetooth(boolean hasBluetooth) {
			this.hasBluetooth = hasBluetooth;
			return this;
		}

		public Computer build() {
			return new Computer(cpu, ram, storage, graphicsCard, hasWifi, hasBluetooth);
		}
	}
}