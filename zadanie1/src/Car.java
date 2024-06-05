import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Car implements Comparable{
    public String nazwaModelu;
    public int rokProdukcji;
    static List<Car> cars = new ArrayList<>();

    public Car(String nazwaModelu, int rokProdukcji) {
        this.nazwaModelu = nazwaModelu;
        this.rokProdukcji = rokProdukcji;
        cars.add(this);
    }

    @Override
    public int sortCars(Car car) {
        

    }
}
