public abstract class Produit {
    protected String name;
    protected int anneeDeParution;
    protected double prix;

  public Produit(String name, int anneeDeParution, double prix) {
    this.name = name;
    this.anneeDeParution = anneeDeParution;
    this.prix = prix;
  }

  public String getName() {
    return name;
  }

  public int getAnneeDeParution() {
    return anneeDeParution;
  }

  public double getPrix() {
    return prix;
  }

  public void setPrix(int prix) {
    this.prix = prix;
  }
}
