package ocjp.learning.ocp.chapter6;

public class ExceptionsAndAssertions {
    public static void main(String[] args) {

        try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {

        } catch (Exception e) {
        }

        assert (-5 < 0);
        assert (-5 < 0) : "not true";

    }
}

class MyCheckedException extends Exception {

}

class MyRuntimeException extends RuntimeException {

}

class Walk implements AutoCloseable {

    @Override
    public void close() {
        throw new RuntimeException("snow");
    }

}