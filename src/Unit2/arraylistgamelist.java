package Unit2;

import java.util.ArrayList;
import java.util.List;

public class arraylistgamelist {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hockey");
        gamesList.forEach(System.out::println);
    }
}
