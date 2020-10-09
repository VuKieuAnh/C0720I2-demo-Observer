import java.util.ArrayList;
import java.util.List;

public class BankApplication implements Subject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void update(String mess) {
        for (Observer o:
             this.observerList) {
            o.update(mess);
        }
    }
}
