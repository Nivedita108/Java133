package Unit2;

import java.util.stream.Stream;

public class streamingiterating {
    public static void main(String[] args) {
        Stream.iterate(1, e->e+1).
                filter(e->e%5==0).
                limit(5).
                forEach(System.out::println);
    }
}
