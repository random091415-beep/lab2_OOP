public class Lab02 {

    public static void main(String[] args) {

        AirPurifier p1 = new AirPurifier(5000, "Xiaomi");
        AirPurifier p2 = new AirPurifier(7000, "Philips");

        IO.println("Total Purifiers = "
                + AirPurifier.getTotalPurifiers());

        p1.turnOn();

        IO.println("P1");
        IO.println("Name: " + p1.getName());
        IO.println("Power: " + p1.isPowerOn());
        IO.println("Fan Level: " + p1.getFanLevel());

        p1.fanUp();
        p1.fanUp();
        p1.fanUp();

        IO.println("Fan Level: "
                + p1.getFanLevel());

        p1.fanDown();

        IO.println("Fan Level: "
                + p1.getFanLevel());

        p1.turnOff();

        IO.println("Power: "
                + p1.isPowerOn());

        IO.println("P2");
        IO.println("Name: " + p2.getName());
        IO.println("Power: " + p2.isPowerOn());
        IO.println("Fan Level: " + p2.getFanLevel());

        IO.println("Total Purifiers = "
                + AirPurifier.getTotalPurifiers());
    }
}
