package design_patterns.builderPractice.cars;

import design_patterns.builderPractice.ccomponents.Engine;
import design_patterns.builderPractice.ccomponents.GPSNavigator;
import design_patterns.builderPractice.ccomponents.Transmission;
import design_patterns.builderPractice.ccomponents.TripComputer;

public class Manual {
    private final Cartype cartype;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Cartype cartype,
                  int seats, Engine engine,
                  Transmission transmission,
                  TripComputer tripComputer,
                  GPSNavigator gpsNavigator) {
        this.cartype = cartype;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String into ="";
        into += "Type of Car : " + cartype + "/n";
        into += "Count of seats : " + seats + "/n";
        into += "Engine : volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "/n";
        into += "Transmission : " + transmission + "/n";
        if (this.tripComputer != null) {
            into += "TripComputer : Functional" + "/n";
        } else {
            into += "TripComputer : N/A" + "/n";
        }

        if (this.gpsNavigator != null) {
            into += "gpsNavigator : Functional" + "/n";
        } else {
            into += "gpsNavigator : N/A" + "/n";
        }
        return into;
    }
}
