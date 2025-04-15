package com.cms.designpatterns;

public class Computer {
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