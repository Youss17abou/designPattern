package strategy;

public class LengthStrategy implements ComparatorStrategy {

  private int length;

  public LengthStrategy(int length) {
    this.length = length;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.length() == this.length;
  }
}
