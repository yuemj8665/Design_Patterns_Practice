package design_patterns.builderPractice.builders;

import design_patterns.builderPractice.cars.Cartype;
import design_patterns.builderPractice.components.Engine;
import design_patterns.builderPractice.components.GPSNavigator;
import design_patterns.builderPractice.components.Transmission;
import design_patterns.builderPractice.components.TripComputer;

/**
 * 빌더 인터페이스는 모든 가능한 방법을 정의한다.
 */
public interface Builder {
    void setCarType(Cartype type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
