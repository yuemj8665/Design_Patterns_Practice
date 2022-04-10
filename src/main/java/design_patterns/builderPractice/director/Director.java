package design_patterns.builderPractice.director;

import design_patterns.builderPractice.builders.Builder;
import design_patterns.builderPractice.cars.Cartype;
import design_patterns.builderPractice.components.Engine;
import design_patterns.builderPractice.components.GPSNavigator;
import design_patterns.builderPractice.components.Transmission;
import design_patterns.builderPractice.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(Cartype.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(Cartype.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(Cartype.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
