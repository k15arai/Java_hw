package classes;

import classes.interfaces.*;

public class Galaxy extends Phone implements Ringable {
    
    public Galaxy (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    // Overrides for interfaces
    @Override
    public String ring() {
        return String.format("Galaxy %s says %s.", getVersionNumber(), getRingTone());
    }

    @Override
    public String unlock() {
        return "Unlocking via finger print.";
    }

    @Override
    public void displayInfo() {
        System.out.printf("Galaxy %s from %s.%n", getVersionNumber(), getCarrier());
    }
}