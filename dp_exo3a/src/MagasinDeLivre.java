public class MagasinDeLivre extends Magasin {

	@Override
	public Produit creerProduit(String name, int anneeDeParution) {
		System.out.println("📚 Création d'un livre: " + name + " (" + anneeDeParution + ")");
		return new Livre(name,anneeDeParution);
	}
}
