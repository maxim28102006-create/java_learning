package review1;

import java.util.Objects;

public class Phone {
    private String model;
    private int battery;
    static final int MAX = 100;

    public Phone(String model, int battery){
        this.model = model;
        this.battery = Math.max(0, Math.min(MAX, battery));
    }

    public String getModel(){
        return  model;

    }

    public int getBattery(){
        return battery;
    }

    public int costPerMinute(){return 2;}

    public void charge(int percent){
        if (percent <= 0) return;
        battery += percent;
        if (battery > MAX) battery = MAX;
    }
    public boolean call(int minutes){
        int need = minutes * costPerMinute();
        if (minutes <= 0 || need > battery) return false;
        battery -= need;
        return true;
    }

    @Override
    public String toString(){
        return "Phone{model='" + model + "', battery=" + battery + "}";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone other = (Phone) o;
        return Objects.equals(model, other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
