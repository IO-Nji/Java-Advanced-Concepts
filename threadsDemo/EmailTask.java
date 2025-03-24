package threadsDemo;

//  Creating a Thread Task Class by extending the Runnable interface And Implementing the run method logic
class EmailTask implements Runnable {

    private final String recipient;
    private final String subject;
    private final String body;

    //    Constructor
    public EmailTask(String recipient, String subject, String body) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    //    Overwriting Run Method from Runnable
    @Override
    public void run() {
        // Simulate sending an email
        System.out.println("Sending email to " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // Code to send the actual email goes here
    }
}
