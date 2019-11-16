package ocjp.learning.ocp.chapter2;

interface CanWalk {
    default void walk() {
        System.out.println("walking");
    }
}

interface CanRun {
    public default void walk() {
        System.out.println("walking");
    }

    public abstract void run();
}

interface CanSprint extends CanWalk, CanRun {
    void sprint();
     public void walk();
}

class Questions {

}
