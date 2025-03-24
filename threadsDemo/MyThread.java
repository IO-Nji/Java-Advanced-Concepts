package threadsDemo;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {

//  Create instances of the Tasks
        EmailTask welcome = new EmailTask(
                "mail@nji.io",
                "Greetings 2025",
                "Hi, Goodmorning"
        );

        EmailTask registration = new EmailTask(
                "mail@nji.io",
                "Register 2025",
                "Registration form"
        );

        Notifier invited = new Notifier(
                "User Invited!"
        );

        Notifier register = new Notifier(
                "Subsribed!"
        );

//  Create instances of the Threads
//      Create a thread for each EmailTask task
        Thread email_1 = new Thread(welcome);
        Thread email_2 = new Thread(registration);

//      Create a thread for each Notifier task
        Thread notifier_1 = new Thread(invited);
        Thread notifier_2 = new Thread(register);

//  Start the threads
//      Start the notifier
        notifier_1.setDaemon(true); // Set the notifier as a daemon
        notifier_1.start();

//      Start the EmailTask threads
        email_1.start();
        email_1.join(); // Main Thread will wait for email_1 to complete
        email_2.start();
        email_2.join(); // Main Thread will wait for email_2 to complete

        notifier_2.start();
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
    }
}


