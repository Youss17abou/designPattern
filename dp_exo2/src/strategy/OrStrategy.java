package strategy;

public class OrStrategy implements ComparatorStrategy {
  private ComparatorStrategy strategy1;
  private ComparatorStrategy strategy2;

  public OrStrategy(ComparatorStrategy strategy1, ComparatorStrategy strategy2) {
    this.strategy1 = strategy1;
    this.strategy2 = strategy2;
  }

  @Override
  public boolean estValide(String mot) {
    return strategy1.estValide(mot) || strategy2.estValide(mot);
  }
}
