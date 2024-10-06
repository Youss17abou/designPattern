package strategy;

public class PalindromeStrategy implements ComparatorStrategy {

  @Override
  public boolean estValide(String mot) {
    String temp = new StringBuilder(mot).reverse().toString();
    return mot.equalsIgnoreCase(temp)  ;
  }
}
