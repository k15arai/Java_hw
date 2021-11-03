package classes;

import classes.Mammal;

public class Gorilla extends Mammal {
    
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }

    public String throwSomething() {
        super.energyLevel = super.energyLevel - 5;
        return String.format("The gorilla has thrown something and energy levels have decreased by to 5 to: %d.", super.energyLevel);
    }

    public String eatBananas() {
        super.energyLevel = super.energyLevel + 10;
        return String.format("The gorilla enjoyed the banana and is now satisfied! Energy Level has increased by 10 to: %d.", super.energyLevel);
    }

    public String climb() {
        super.energyLevel = energyLevel - 10;
        return String.format("The gorilla climbed a tree and is now tired. Energy Level has decreased by 10 to: %d.", super.energyLevel);
    }
}