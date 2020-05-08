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
    public static void main(String[] args) {

        // C1 c1 = new C1();
        C1 c1 = new C2();
        C2 c2 = (C2) c1;

    }
}

class C1 {
}

class C2 extends C1 {
}
