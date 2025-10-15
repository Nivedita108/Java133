package Unit2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Productfiltermain {
    public static void main(String[] args) {
        List<Productfilter> productlist=new ArrayList<>();
        productlist.add(new Productfilter(1,"HP",120000));
        productlist.add(new Productfilter(2,"HP1",140000));
        productlist.add(new Productfilter(3,"HP2",450000));
        productlist.add(new Productfilter(4,"HP3",180000));
        productlist.add(new Productfilter(5,"HP4",160000));
        productlist.add(new Productfilter(6,"HP5",340000));
        productlist.add(new Productfilter(7,"HP5",520000));
//        List<Double> newList= productlist.stream().
//                filter(p->p.price>200000).
//                map(p->p.price).
//                collect(Collectors.toList());
//        System.out.println(newList);


//        productlist.stream()
//                .filter(product -> product.price >= 300000)
//                .forEach(product -> System.out.println(product.name));


        long count = productlist.stream()
                .filter(product->product.price<300000)
                .count();
        System.out.println(count);
    }
}
