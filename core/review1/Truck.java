package review1;

public class Truck extends Car {
    private int cargo;

    public Truck(String model, double fuel, double consumption, int cargo){
        super(model, fuel, consumption);
        this.cargo = cargo;
    }

    public int getCargo(){
        return cargo;
    }

    @Override
    public double fuelNeeded(double km){
        return km *(getConsumption() + cargo)/ 100;
    }
}
