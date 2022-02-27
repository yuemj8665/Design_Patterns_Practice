package design_patterns.builderPractice;

import design_patterns.builderPractice.builders.CarBuilder;
import design_patterns.builderPractice.builders.CarManualBuilder;
import design_patterns.builderPractice.cars.Car;
import design_patterns.builderPractice.cars.Manual;
import design_patterns.builderPractice.director.Director;

public class BuilderPractice_Application {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:/n" + car.getCartype());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("/nCar manual built:/n" + manual.print());

    }
}
