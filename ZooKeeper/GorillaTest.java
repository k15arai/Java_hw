import java.util.*;

import classes.Gorilla;

public class GorillaTest {
    public static void main(String[] args) {

        Gorilla g = new Gorilla(100);
        String afterThrow = g.throwSomething();
        String afterBananas = g.eatBananas();
        String afterClimb = g.climb();
        System.out.println(afterThrow);
        System.out.println(afterBananas);
        System.out.println(afterClimb);

    }
}