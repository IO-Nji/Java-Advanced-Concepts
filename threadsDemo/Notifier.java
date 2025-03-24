package threadsDemo;

//  Creating a Thread Task Class by extending the Thread Class And Implementing the run method logic
public class Notifier extends Thread {
    private final String message;

    //    Constructor
    public Notifier(String message) {
        this.message = message;
    }

    //    Overriding the run method
    @Override
    public void run() {
        System.out.println(message);
    }

}
