package classes;

public class Mammal {
    public int energyLevel = 100;

    // constructor without parameters
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Energy Level:" + " " + energyLevel);
        return energyLevel;
    }

}