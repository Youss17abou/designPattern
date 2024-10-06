package strategy;

public class Compteur implements ComparatorStrategy{

  private ComparatorStrategy strategy;
  private int count;

  public Compteur(ComparatorStrategy strategy) {
    this.strategy = strategy;
    this.count = 0;
  }

  @Override
  public boolean estValide(String mot) {
    boolean selected = strategy.estValide(mot);
    if (selected)
      count++;
    return selected;
  }
  public int getCount() {
    return count;
  }
}
