import java.util.*;

import classes.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {

        Gorilla g = new Gorilla(100); // why do I need to input 100 here?
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