package ocjp.learning.ocp.chapter1;

public enum Season {

    WINTER("Low") {
        public void doSomething() {
            System.out.println(this.name() + " - doSomething()");
        }
    },
    SPRING("Medium") {
        public void doSomething() {
            System.out.println(this.name() + " - doSomething()");
        }
    },
    SUMMER("High") {
        public void doSomething() {
            System.out.println(this.name() + " - doSomething()");
        }

        public void doSomething1() {
            System.out.println(this.name() + " - doSomething1()");
        }
    },
    FALL("Medium") {
        public void doSomething() {
            System.out.println(this.name() + " - doSomething()");
        }
    };

    private String expectedVisitors;

    private Season(String expectedVisitors) {
        System.out.println("Enum constructor");
        this.expectedVisitors = expectedVisitors;
    }

    public abstract void doSomething();

    public void doSomething1() {
        System.out.println("doSomething1");
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

}

class TestSeason {

    public static void main(String[] args) {

        for (Season s : Season.values()) {
            System.out.println(s.name() + " " + s.ordinal());
        }

        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(season == Season.SUMMER);

        /*
        // cannot compare int to enum - an enum is a type
        if(season == 2){

        }
         */

        // case sensitive
        Season s = Season.valueOf("SUMMER");
        System.out.println(s);


        switch (season) {
            case SUMMER:
                System.out.println("It is summer!");
                break;
//            case Season.SUMMER:
//                System.out.println("It is summer! - too bad it does not compile");
            case SPRING:
                System.out.println("It is spring!");
            default:
                System.out.println("no idea");
        }

        season.printExpectedVisitors();
        Season.FALL.printExpectedVisitors();

        season.doSomething();
        season.doSomething1();
        Season.FALL.doSomething1();


    }

}

// cannot extend an enum
//class ExtendedSeason extends Season {}
