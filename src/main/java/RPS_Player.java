import java.util.Random;

public class RPS_Player {
    private int numberOfGamesWon;
    private int numberOfGamesPlayed;
    private int choice;
    private String name;

    Random mk = new Random();

    public RPS_Player(String name){
        numberOfGamesWon = 0;
        numberOfGamesPlayed = 0;
        choice = mk.nextInt(2);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    /**
     * Returns the number of games played since a clear() was issued.
     * @return returns the number of games played.
     */
    public int getNumberOfGamesPlayed(){
       return numberOfGamesPlayed;
    }

    /**
     * Returns the number of games won since a clear() was issued.
     * @return returns the number of games won.
     */
    public int getNumberOfGamesWon(){
        return numberOfGamesWon;
    }

    public int getChoice() {
        return choice;
    }

    /**
     * Returns the win percentage as number between 0 and 1.
     * @return win percentage as a double.
     */
    public double getWinPercentage(){
        if (numberOfGamesWon == 0) return 0.0;
        return (double) (numberOfGamesWon) / (double) (numberOfGamesPlayed);
    }

    public void addWin(){
        this.numberOfGamesWon += 1;
    }

    public void addPlayed(){
        this.numberOfGamesPlayed += 1;
    }


    /**
     * Starts a new game.
     */
    public void clear(){
        numberOfGamesPlayed = 0;
        numberOfGamesWon = 0;
    }

    /**
     * This player challenges anotherPlayer whereby both players make a
     * random choice of rock, paper, scissors.  A reference to the winning
     * player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player challenge(RPS_Player anotherPlayer){
        if (getChoice() == anotherPlayer.getChoice()) {
            addPlayed();
            anotherPlayer.addPlayed();
            return null;
        }
        if (getChoice() == 0 && anotherPlayer.getChoice() == 2){
            addWin();
            addPlayed();
            anotherPlayer.addPlayed();
            return this;
        }
        if (getChoice() == 2 && anotherPlayer.getChoice() == 1) {
            addWin();
            addPlayed();
            anotherPlayer.addPlayed();
            return this;
        }
        if (getChoice() == 1 && anotherPlayer.getChoice() == 0) {
            addWin();
            addPlayed();
            anotherPlayer.addPlayed();
            return this;
        }
        else {
            anotherPlayer.addPlayed();
            anotherPlayer.addWin();
            addPlayed();
            return anotherPlayer;
        }
    }

    /**
     * This player challenges anotherPlayer whereby this player uses the previous
     * choice made and anotherPlayer makes a random choice of rock, paper, scissors.
     * A reference to the winning player is returned or null if there is a draw.
     * @param anotherPlayer an RPS_Player that this player is challenging.
     * @return Reference to the RPS_Player that won or a null if there is a draw
     */
    public RPS_Player keepAndChallenge(RPS_Player anotherPlayer){
        // TODO: replace this line with your code.
        return null;
    }

}
