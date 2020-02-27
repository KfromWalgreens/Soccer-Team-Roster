public class Player {
    private int playerJerseyNumber;
    private int playerRanking;

    //constructor
    public Player(int playerJerseyNumber, int playerRanking){
        this.playerJerseyNumber = playerJerseyNumber;
        this.playerRanking = playerRanking;
    }

    //setter methods
    public void setPlayerJerseyNumber(int jerseyNumber){
        playerJerseyNumber = jerseyNumber;
    }

    public void setPlayerRanking(int ranking){
        playerRanking = ranking;
    }

    //getter methods
    public int getPlayerJerseyNumber(){
        return playerJerseyNumber;
    }

    public int getPlayerRanking(){
        return playerRanking;
    }

    //toString method
    public String toString(){
        return "Jersey number: " + playerJerseyNumber + ", Rating: " + playerRanking;
    }
}
