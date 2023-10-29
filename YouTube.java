import java.util.ArrayList;
import java.util.List;

public class YouTube implements Observed{
    List<String> videos = new ArrayList<>();
    List<Observer> subscribers= new ArrayList<>();
    public void addVideo(String videoName){
        this.videos.add(videoName);
        notifyObservers();
    }
    public void removeVideo(String videoName){
        this.videos.remove(videoName);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.videos);
        }
    }
}
