package Coding_playground.Java_labs;

public class Player {
  private String name;
  private int score;
  private Die playerDie;
  
  public Player(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public int getScore(){
    return score;
  }

  public void setScore(int score){
    this.score=score;
  }

  public void rollDice() {
    playerDie.roll();
  }

  public int getDieValue(){
    return playerDie.getValue(); 
  }

  public void increaseScore(){
    score++;    
  }

  public void addDie(int playerSides){
    Die playerNewDie = new Die(playerSides);
    this.playerDie=playerNewDie;
  }
 
}
