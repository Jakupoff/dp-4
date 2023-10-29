import java.util.List;

public class Subscribers implements Observer{
    String name;

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nThe YouTube bloger has made some videos:\n" + vacancies + "\n");
    }
}
