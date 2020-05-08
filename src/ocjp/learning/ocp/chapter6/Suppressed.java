package ocjp.learning.ocp.chapter6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Suppressed {
    public static void main(String[] args) {
        try (Bad bad1 = new Bad("1"); /* System.out.println(""); */ Bad bad2 = new Bad("2")) {
            throw new Exception("from try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("suppressed: " + throwable);

            }
            //throw new IllegalArgumentException("illegal");
        } finally {
            throw new RuntimeException("from finally");
        }
    }
}

class Bad implements AutoCloseable {
    String name;

    Bad(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Closing - " + name);
    }

}