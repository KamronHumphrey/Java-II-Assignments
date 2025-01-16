public class Main {
    public static void main(String[] args) {
        // Creating new player object using the player class
        Player player = new Player("KH", 100);

        // Output
        System.out.println("|Player Information|");
        System.out.println("Initials: " + player.getInitials());
        System.out.println("Score: " + player.getScore());
    }
}

// Create player class
class Player {

    // Constructor (I like to put constructors at the top)
    public Player(String initials, int score) {
        this.setInitials(initials);
        this.setScore(score);
    }

    // Initialize the two private fields
    private String initials;
    private int score;

    // Getter and Setter for the initials
    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    // Getter and Setter for the score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
