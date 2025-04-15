package com.cms.designpatterns;

public class Main {
    public static void main(String[] args) {
        // Creating a basic computer with mandatory parameters
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                .build();

        // Creating a computer with all optional parameters
        Computer fullComputer = new Computer.Builder("Intel i9", "32GB", "1TB NVMe")
                .graphicsCard("NVIDIA RTX 3080")
                .hasWifi(true)
                .hasBluetooth(true)
                .build();

        // Creating a computer with some optional parameters
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB", "500GB SSD")
                .graphicsCard("AMD Radeon RX 6700 XT")
                .hasWifi(false)
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Full Computer: " + fullComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}