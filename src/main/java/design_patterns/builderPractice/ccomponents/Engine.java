package design_patterns.builderPractice.ccomponents;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }
    public void off() {
        started = false;
    }

    public void go() {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(). YOU MUST START ENGINE FIRST!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isStarted() {
        return started;
    }
}
