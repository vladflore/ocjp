package ocjp.learning.ocp.oraclepress;

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

public class TestEnum {

    public enum DAYS {MON, TUE, WED};

    static Animals a;

    public static void main(String[] args) {
        // static access does not need an object
        System.out.println(a.DOG.sound + " " + a.CAT.sound);
    }

}
