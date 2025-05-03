package Zaynyattya_6.Urok_6_practice.robots;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List robots = new ArrayList();
        robots.add(new Gardener());
        robots.add(new SecurityRobot());
        robots.add(new WorkerRobot());

        for (int i = 0; i < robots.size(); i++) {
            if(robots.get(i) instanceof WallBuilder) {
                WallBuilder builder = (WallBuilder) robots.get(i);
                builder.bildWall();
            } else {
                System.out.println("I cannot build the wall" + robots.get(i).getClass().getSimpleName());
            }
            
        }
    }
}
