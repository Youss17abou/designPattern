package strategy;


public class StartWithStrategy implements ComparatorStrategy{
  private char lettre;


  public StartWithStrategy(char lettre) {
    this.lettre = lettre;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.toLowerCase().toCharArray()[0]==lettre;
  }
}



