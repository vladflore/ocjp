package ocjp.learning.ocp.chapter1;

public class AnonInner {
//    interface SaleTodayOnly {
//        int dollarsOff();
//    }

    /*abstract*/ class SaleTodayOnly extends C implements I, I1 {
        /*abstract*/
        public int dollarsOff() /*;*/ {
            return 5;
        }

        @Override
        public int euroOff() {
            return 0;
        }
    }


    public int pay() {
        return admission(5, new SaleTodayOnly() {
            //            @Override
            public int dollarsOff() {
                return 3;
            }

            public int euroOff() {
                return 5;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.euroOff();
    }

    public static void main(String[] args) {
        AnonInner anonInner = new AnonInner();
        System.out.println(anonInner.pay());
    }
}

interface I {
    int dollarsOff();
}

interface I1 {
    int euroOff();
}

class C {

}
