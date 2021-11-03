package classes;

import classes.Mammal;

public class Bat extends Mammal {
    
    public Bat(int energyLevel) {
        super(300);
    }

    // fly()
    public String fly() {
        super.energyLevel = super.energyLevel - 50;
        return String.format("Squeak Squeak Squeak!");
    }
    
    // eatHumans()
    public void eatHumans() {
        super.energyLevel = super.energyLevel + 25;
    }
    
    // attackTown()
    public String attackTown() {
        super.energyLevel = super.energyLevel - 100;
        return String.format("Crackle crackle Sizzle sizzle!");
    }
}