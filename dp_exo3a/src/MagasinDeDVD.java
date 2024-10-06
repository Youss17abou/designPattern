
public class MagasinDeDVD extends Magasin {

  @Override
  public Produit creerProduit(String name, int anneeDeParution) {
    System.out.println("📀 Création d'un DVD: " + name + " (" + anneeDeParution + ")");
    return new DVD(name, anneeDeParution);
  }
}
