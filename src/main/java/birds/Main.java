package birds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Sparrow());
        birds.add(new Ostrich());

        for (Bird bird:birds) {
            bird.eat();
        }
    }
}