import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            ArrayList<Car> cars = new ArrayList<>();
            cars.add(new Car("Ss", 2010));
            cars.add(new Car("Sd", 2011));
            cars.add(new Car("Sf", 2015));
            cars.add(new Car("Sg", 2022));
            cars.add(new Car("Sh", 2001));
            cars.add(new Car("Sj", 2003));
            cars.add(new Car("Sk", 2005));
            cars.add(new Car("Sl", 2000));
            cars.add(new Car("Sm", 2009));
            cars.add(new Car("Sc", 2012));

            Collections.sort(cars);
            for(Car car : cars){
                    System.out.println(car);
            }
    }

}