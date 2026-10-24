
class Thermostat {

    // Store the temperature
    private int temperature;
    private static int unitsCreated = 0;
    public Thermostat() {
        temperature = 20;
        unitsCreated++;
    }

    // Constructor with temperature
    public Thermostat(int temperature) {
        this(); // Call the no-argument constructor
        this.temperature = temperature;
    }
    // Return the temperature
    public int getTemperature() {
        return temperature;
    }
    public static int getUnitsCreated() {
        return unitsCreated;
    }
}

public class Main {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat();
        Thermostat t2 = new Thermostat(24);

        // Print both temperatures
        System.out.println(t1.getTemperature());
        System.out.println(t2.getTemperature());

        System.out.println(Thermostat.getUnitsCreated());
    }
}
