package design_patterns.builderPractice.cars;


import design_patterns.builderPractice.components.Engine;
import design_patterns.builderPractice.components.GPSNavigator;
import design_patterns.builderPractice.components.Transmission;
import design_patterns.builderPractice.components.TripComputer;

public class Car {
    private final Cartype cartype;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(Cartype cartype, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,GPSNavigator gpsNavigator) {
        this.cartype = cartype;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }


    public Cartype getCartype() {
        return cartype;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public Car setFuel(double fuel) {
        this.fuel = fuel;
        return this;
    }

}
