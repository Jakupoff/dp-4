public class Runner {
    public static void main(String[] args) {
        YouTube youTube = new YouTube();

        youTube.addVideo("How to play tasty cake");
        youTube.addVideo("Is there any changes in Kazakhstan?");

        Observer firstSubscriber = new Subscribers("Rustem Zhakupoff");
        Observer secondSubscriber = new Subscribers("Devon Larrat");

        youTube.addObserver(firstSubscriber);
        youTube.addObserver(secondSubscriber);

        youTube.addVideo("Barcelona vs Real Madrid review");

        youTube.removeVideo("The life of Java Team Lead");
    }
}
