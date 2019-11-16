package ocjp.learning.ocp.chapter3;

public class GenericClass {
    public static void main(String[] args) {
        Crate<String> stringCrate = new Crate<>();
        stringCrate.packCrate("this time it is a string");
        System.out.println(stringCrate.emptyCrate());

    }
}

class Crate<T> {
    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}

interface Shippable<T> {
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot> {

    @Override
    public void ship(Robot robot) {

    }
}

class Robot {

}

class ShippableAbstractCrate<U> implements Shippable<U> {

    @Override
    public void ship(U u) {

    }
}

class ShippableCrate implements Shippable {

    @Override
    public void ship(Object o) {

    }
}
