package view.console;

import model.Parking;
import model.Plaza;
import model.Car;
import model.Bike;
import model.Truck;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Parking parking = new Parking("123", "Parking Monlau", "Carrer Monlau, 6", "678-912-345", 3, 10, 0.5, 0.2, 0.3);

        Car car = new Car("ABC123", "Red");
        
        Truck truck = new Truck("TRK123", "Blue");
        Truck truck2 = new Truck("TRK123", "Blue");

        Bike bike = new Bike("MOTO123", "Black");

        System.out.println(parking.parkVehicle(car));          // Park a car
        System.out.println(parking.parkVehicle(truck));        // Park a truck
        System.out.println(parking.parkVehicle(truck2));        // Park a truck

        System.out.println(parking.parkVehicle(bike));         // Park a bike

        parking.showAvailableSpaces();                         // Show available spaces

        System.out.println("\n\n\n");
        parking.removeVehicle("PR123_0_3", bike);              // Remove a vehicle based on ticket
        parking.showAvailableSpaces();                         // Show available spaces again
    }
}
