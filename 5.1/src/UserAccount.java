import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserAccount {
    private String alias;
    private String email;
    private List<Tweet2> tweets;
    private List<UserAccount> followers;

    public UserAccount(String alias, String email) {
        if (!Utils.isValidAlias(alias)) {
            throw new IllegalArgumentException("El alias no es válido.");
        }
        if (!Utils.isValidEmail(email)) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
    }


    public void follow(UserAccount userToFollow) {
        if (this == userToFollow) {
            throw new IllegalArgumentException("No puedes seguirte a ti mismo.");
        }
        if (followers.contains(userToFollow)) {
            System.out.println("Ya estás siguiendo a " + userToFollow.getAlias());
        } else {
            followers.add(userToFollow);
        }
    }

    public void tweet(Tweet2 tweet) {
        tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.addToTimeline(tweet);
        }
    }

    private void addToTimeline(Tweet2 tweet) {

    }

    @Override
    public String toString() {
        return "Usuario: " + alias + ", Correo electrónico: " + email;
    }



    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public List<Tweet2> getTweets() {
        return tweets;
    }

    public List<UserAccount> getFollowers() {
        return followers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese su alias:");
        String alias = scanner.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        String email = scanner.nextLine();


        UserAccount user1 = new UserAccount(alias, email);


        System.out.println("Ingrese el contenido del tweet:");
        String content = scanner.nextLine();


        Tweet2 tweet = new Tweet2(content);


        user1.tweet(tweet);

        System.out.println("¡Tweet publicado con éxito!");
    }
}

class Tweet2 {
    private String content;

    public Tweet2(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Tweet: " + content;
    }
}

class Utils {
    public static boolean isValidAlias(String alias) {
        return alias.matches("[a-zA-Z0-9]+");
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}