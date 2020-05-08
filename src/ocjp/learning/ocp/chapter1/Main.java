package ocjp.learning.ocp.chapter1;

public class Main {

    public static void main(String[] args) {

        Building b = new Building();
        House h = new House();
        Building bh = new House();

        //Building p1 = (House) b;
        House p2 = (House) b;

        House q1 = (House) (Building) h;
        // House q2 = (Building) h;

    }

}

class Building {
}

class House extends Building {
}