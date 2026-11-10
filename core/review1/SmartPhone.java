package review1;

public class SmartPhone extends Phone {
    private int apps;

    public SmartPhone(String model, int battery, int apps){
        super(model, battery);
        this.apps = apps;
    }

    public int getApps() {
        return apps;
    }

    @Override
    public int costPerMinute() {
        return 2 + apps / 5;
    }
}

