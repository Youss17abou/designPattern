package strategy;

public class NotStrategy implements ComparatorStrategy{
  private ComparatorStrategy strategy1;

  public NotStrategy(ComparatorStrategy strategy1) {
    this.strategy1 = strategy1;
  }

  @Override
  public boolean estValide(String mot) {
    return !strategy1.estValide(mot);
  }
}
