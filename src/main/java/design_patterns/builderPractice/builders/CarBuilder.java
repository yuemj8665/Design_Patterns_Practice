package design_patterns.builderPractice.builders;

import design_patterns.builderPractice.cars.Car;
import design_patterns.builderPractice.cars.Cartype;
import design_patterns.builderPractice.components.Engine;
import design_patterns.builderPractice.components.GPSNavigator;
import design_patterns.builderPractice.components.Transmission;
import design_patterns.builderPractice.components.TripComputer;

public class CarBuilder implements Builder {

    /**
     * 생성자 빌더는 공통 인터페이스에서 정의된 내용을 구현한다.
     */

    private Cartype type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(Cartype type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
