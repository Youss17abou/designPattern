package strategy;

import java.util.ArrayList;
import java.util.Collections;

public class EtStrategy implements ComparatorStrategy{
  ArrayList<ComparatorStrategy> strategyArrayList;

  public EtStrategy(ComparatorStrategy... strategies) {
    this.strategyArrayList = new ArrayList<>();
    Collections.addAll(strategyArrayList,strategies);
  }

  @Override
  public boolean estValide(String mot) {
    for (ComparatorStrategy strategy : strategyArrayList) {
      if (!strategy.estValide(mot)){
        return false;
      }
    }
    return true;
  }
}
