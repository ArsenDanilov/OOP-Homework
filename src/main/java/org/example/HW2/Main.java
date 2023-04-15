package org.example.HW2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Ivan", 60, 2);
        Robot robot = new Robot("Cyborg", 100, 5);
        Cat cat = new Cat("Barsik", 80, 3);
        RunningRoad road1 = new RunningRoad(50);
        Wall wall1 = new Wall(4);
        RunningRoad road2 = new RunningRoad(85);

        ArrayList<Participant> participants = new ArrayList<>(Arrays.asList(human, robot, cat));
        ArrayList<Obstacle> obstacles = new ArrayList<>(Arrays.asList(wall1, road2, road1));

        for (Participant p: participants) {
            for (Obstacle o : obstacles) {
                if (!p.getOver(o)) {
                    break;
                }
            }
        }

    }
}

