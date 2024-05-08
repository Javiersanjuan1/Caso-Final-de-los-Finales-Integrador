import java.time.LocalDate;

public class Twitter5 {
    public static void main(String[] args) {

        UserAccount user1 = new UserAccount("user1", "user1@example.com");
        UserAccount user2 = new UserAccount("user2", "user2@example.com");


        Tweet5 tweet51 = new Tweet5(LocalDate.now(), "Este es un tweet de ejemplo.", user1);
        System.out.println(tweet51);


        DirectMessage dm = new DirectMessage(LocalDate.now(), "¡Hola!", user1, user2);
        System.out.println(dm);


        Retweet retweet = new Retweet(LocalDate.now(), "¡Miren esto!", user2, tweet51);
        System.out.println(retweet);
    }
}

class Tweet5 {
    private LocalDate time;
    private String message;
    private UserAccount sender;

    public Tweet5(LocalDate time, String message, UserAccount sender) {
        if (message.length() > 140) {
            throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres.");
        }
        this.time = time;
        this.message = message;
        this.sender = sender;
    }

    public Tweet5(String contenido, Usuario2 usuario2) {
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "time=" + time +
                ", message='" + message + '\'' +
                ", sender=" + sender.getAlias() +
                '}';
    }
}

class DirectMessage extends Tweet5 {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "time=" + super.toString() +
                ", receiver=" + receiver.getAlias() +
                '}';
    }
}

class Retweet extends Tweet5 {
    private Tweet5 originalTweet5;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet5 originalTweet5) {
        super(time, message, sender);
        this.originalTweet5 = originalTweet5;
    }

    @Override
    public String toString() {
        return "Retweet{" +
                "time=" + super.toString() +
                ", originalTweet=" + originalTweet5 +
                '}';
    }
}