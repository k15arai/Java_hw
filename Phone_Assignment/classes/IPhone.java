package classes;

import classes.interfaces.*;

public class IPhone extends Phone implements Ringable {

    public IPhone (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    // Overrides for interfaces
    @Override
    public String ring() {
        return String.format("iPhone %s says %s", getVersionNumber(), getRingTone());
    }

    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }

    @Override
    public void displayInfo() {
        System.out.printf("iPhone %s from %s.%n", getVersionNumber(), getCarrier());

    }
}