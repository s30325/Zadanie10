import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Car implements Comparable<Car> {
    public String nazwaModelu;
    public int rokProdukcji;
 -m zadan

    public Car(String nazwaModelu, int rokProdukcji) {
        this.nazwaModelu = nazwaModelu;
        this.rokProdukcji = rokProdukcji;

    }


    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.rokProdukcji, o.rokProdukcji);
    }
    @Override
    public String toString() {
        return "Car{" +
                "nazwaModelu='" + nazwaModelu + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}
