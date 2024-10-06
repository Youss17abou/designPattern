import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {

  private final Map<String, Produit> stockMap = new HashMap<>();

  public void ajouter(String name, int anneeDeParution) {
    System.out.print("➕ Ajout de: " + name + " au stock");
    Produit produit = creerProduit(name, anneeDeParution);
    stockMap.put(name, produit);
  }

  public Produit retourne(String name) {
    System.out.println("➖ Retrait de: " + name + " au stock");

    return stockMap.get(name);
  }

  public abstract Produit creerProduit(String name, int anneeDeParution);
}
