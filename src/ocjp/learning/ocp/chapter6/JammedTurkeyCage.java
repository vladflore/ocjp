package ocjp.learning.ocp.chapter6;

public class JammedTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("cage door does not close!");
    }

    public static void main(final String... args) {
        try (JammedTurkeyCage jtc = new JammedTurkeyCage()) {
            throw new IllegalStateException("turkeys ran off");
        } catch (final IllegalStateException e) {
            System.out.println("Exception: " + e);
        } finally {
            throw new RuntimeException(" and we could't find them");
        }
    }

}
