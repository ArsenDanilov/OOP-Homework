package org.example.HW2;

public abstract class Participant {
    private String name;
    private int maxDistance;
    private int maxHeight;


    public Participant(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean getOver(Obstacle obstacle) {
        boolean result = false;
        if (obstacle instanceof Wall) {
            result = jump((Wall) obstacle);
        } else if (obstacle instanceof RunningRoad) {
            result = run((RunningRoad) obstacle);
        }
        return result;
    }

    private boolean jump(Wall wall) {
        if (getMaxHeight() < wall.getSize()){
            System.out.println(getName() + " не смог подпрыгнуть на расстояние " +
                    (wall.getSize() - getMaxHeight()) + " метров");
            return false;
        } else {
            System.out.println(getName() + " смог набрать нужную высоту");
            return true;
        }
    }

    private boolean run(RunningRoad runningRoad){
        if (getMaxDistance() < runningRoad.getSize()){
            System.out.println(getName() + " не смог пробежать" +
                    (runningRoad.getSize() - getMaxDistance()) + " метров");
            return false;
        } else {
            System.out.println(getName() + " добежал до конца");
            return true;
        }
    }

}

