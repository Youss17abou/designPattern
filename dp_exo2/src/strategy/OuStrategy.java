package strategy;

import java.util.ArrayList;
import java.util.Collections;

public class OuStrategy implements ComparatorStrategy{
  ArrayList<ComparatorStrategy> strategyArrayList;

  public OuStrategy(ComparatorStrategy... strategies) {
    this.strategyArrayList = new ArrayList<>();
    Collections.addAll(strategyArrayList,strategies);
  }

  @Override
  public boolean estValide(String mot) {
    for (ComparatorStrategy strategy : strategyArrayList) {
      if (strategy.estValide(mot)){
        return true;
      }
    }
    return false;
  }
}
