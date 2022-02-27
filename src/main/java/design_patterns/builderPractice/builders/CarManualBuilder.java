package design_patterns.builderPractice.builders;

import design_patterns.builderPractice.cars.Car;
import design_patterns.builderPractice.cars.Cartype;
import design_patterns.builderPractice.cars.Manual;
import design_patterns.builderPractice.ccomponents.Engine;
import design_patterns.builderPractice.ccomponents.GPSNavigator;
import design_patterns.builderPractice.ccomponents.Transmission;
import design_patterns.builderPractice.ccomponents.TripComputer;

/**
 * 다른 생성 패턴과 달리 Builder는 공통 인터페이스가 없는 관련 없는 제품을 구성할 수 있습니다.
 * 이 경우 우리는 자동차를 만들 때와 같은 단계를 사용하여 자동차 사용자 매뉴얼을 만듭니다.
 * 이를 통해 다양한 기능으로 구성된 특정 자동차 모델에 대한 매뉴얼을 생성할 수 있습니다.
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
