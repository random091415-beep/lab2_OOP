public class AirPurifier {
    private int price = 0;
    private boolean powerOn = false;
    private String name = "AirP";
    private int fanLevel = 0;
    private static int totalPurifiers = 0;

    public AirPurifier(int price, String name) {
        this.name = name;
        this.price = price;
        totalPurifiers++;
    }

    public void turnOn() {
        powerOn = true;
    }

    public void turnOff() {
        powerOn = false;
    }

    public void fanUp() {
        if(fanLevel < 3) fanLevel++;
    }

    public void fanDown() {
        if(fanLevel > 1) fanLevel--;
    }

    public static int getTotalPurifiers() {
        return totalPurifiers;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getFanLevel() {
        return fanLevel;
    }
}
