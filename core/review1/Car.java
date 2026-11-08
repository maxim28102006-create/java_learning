package review1;

import java.util.Objects;

public class Car {
    private String model;
    private double fuel;
    private double consumption;
    public static final int TANK_SIZE = 50;

    public Car(String model, double fuel, double consumption){
        if(fuel > TANK_SIZE){
            fuel = TANK_SIZE;
        }
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;

    }
    public String getModel(){
        return model;
    }

    public double getFuel(){
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    public void refuel(double liters){
        if(liters <= 0){
            return;
        }
        fuel += liters;
        if(fuel > TANK_SIZE){
            fuel = TANK_SIZE;
        }
    }

    public double fuelNeeded(double km){
        return km * consumption / 100;
    }

    public boolean drive(double km){
        double need = fuelNeeded(km);
        if(km <= 0 || need > fuel){
            return false;
        }
        fuel -= need;
        return true;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', fuel=" + fuel + ", consumption=" + consumption + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car other = (Car) o;
        return Objects.equals(model, other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
