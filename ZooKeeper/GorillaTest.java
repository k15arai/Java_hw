import java.util.*;

import classes.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {

        Gorilla g = new Gorilla(100);
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBananas();
        g.eatBananas();
        g.climb();
        int currentEnergy = g.displayEnergy();
        System.out.println(currentEnergy);
    }
}