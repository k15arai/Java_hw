import java.util.*;

import classes.Bat;

public class BatTest {
    public static void main(String[] args) {

        Bat b = new Bat(300); // why do I need to input 300 here?
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();
        b.fly();
        int currentBatEnergy = b.displayEnergy();
        System.out.println(currentBatEnergy);
    }
}