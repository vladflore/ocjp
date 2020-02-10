package ocjp.learning.ocp.chapter8;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("//home//vlad//vladflore.dev//sandbox//ocjp//file.txt");
        if(file.exists()){
            System.out.println("there");
        }    
    }
}