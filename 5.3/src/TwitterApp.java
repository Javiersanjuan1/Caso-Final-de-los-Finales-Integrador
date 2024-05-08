import java.time.LocalDate;

public class TwitterApp {
    public static void main(String[] args) {

        UserAccount user1 = new UserAccount("user1", "user1@example.com");
        UserAccount user2 = new UserAccount("user2", "user2@example.com");

        TweetPost tweet1 = new TweetPost(LocalDate.now(), "Este es un tweet de ejemplo.", user1);
        System.out.println(tweet1);

        DirectMessagePrivate dm = new DirectMessagePrivate(LocalDate.now(), "¡Hola!", user1, user2);
        System.out.println(dm);

        RetweetForward retweet1 = new RetweetForward(LocalDate.now(), "¡Miren esto!", user2, tweet1);
        System.out.println(retweet1);
    }

    public static class UserAccount {
        private String alias;
        private String email;

        public UserAccount(String alias, String email) {
            this.alias = alias;
            this.email = email;
        }

        public String getAlias() {
            return alias;
        }

        public String getEmail() {
            return email;
        }
    }

    public static class TweetPost {
        private LocalDate time;
        private String message;
        private UserAccount sender;

        public TweetPost(LocalDate time, String message, UserAccount sender) {
            if (message.length() > 140) {
                throw new IllegalArgumentException("El mensaje no puede tener más de 140 caracteres.");
            }
            this.time = time;
            this.message = message;
            this.sender = sender;
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

    public static class DirectMessagePrivate extends TweetPost {
        private UserAccount receiver;

        public DirectMessagePrivate(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
            super(time, message, sender);
            this.receiver = receiver;
        }

        @Override
        public String toString() {
            return "DirectMessage{" +
                    "time=" + super.time +
                    ", message='" + super.message + '\'' +
                    ", sender=" + super.sender.getAlias() +
                    ", receiver=" + receiver.getAlias() +
                    '}';
        }
    }

    public static class RetweetForward extends TweetPost {
        private TweetPost originalTweet;

        public RetweetForward(LocalDate time, String message, UserAccount sender, TweetPost originalTweet) {
            super(time, message, sender);
            this.originalTweet = originalTweet;
        }

        @Override
        public String toString() {
            return "Retweet{" +
                    "time=" + super.time +
                    ", message='" + super.message + '\'' +
                    ", sender=" + super.sender.getAlias() +
                    ", originalTweet=" + originalTweet +
                    '}';
        }
    }
}
