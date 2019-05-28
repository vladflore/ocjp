package ocjp.learning.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    static class ValueHolder {
        private Integer value;

        public ValueHolder(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        List<ValueHolder> list = new ArrayList<>();
        list.add(new ValueHolder(1));
        list.add(new ValueHolder(2));
        list.add(new ValueHolder(3));
        list.add(new ValueHolder(4));
        list.add(new ValueHolder(5));

        System.out.println(list.stream().map(item -> item.getValue()).collect(Collectors.toList()));


    }
}
