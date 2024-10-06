public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    MagasinDeLivre magasinDeLivre = new MagasinDeLivre();
    MagasinDeDVD magasinDeDVD = new MagasinDeDVD();

    magasinDeLivre.ajouter("Harry Potter", 2000);
    magasinDeLivre.ajouter("Harry Potter 2", 2001);
    magasinDeLivre.ajouter("Harry Potter 3", 2002);

    magasinDeDVD.ajouter("Oh Hakhy Potter", 2000);
    magasinDeDVD.ajouter("Oh Hakhy Potter 2", 2001);
    magasinDeDVD.ajouter("Oh Hakhy Potter 3", 2002);

    magasinDeLivre.retourne("Harry Potter");
    magasinDeLivre.retourne("Harry Potter 2");
    magasinDeLivre.retourne("Harry Potter 3");

    magasinDeDVD.retourne("Oh Hakhy Potter");
    magasinDeDVD.retourne("Oh Hakhy Potter 2");
    magasinDeDVD.retourne("Oh Hakhy Potter 3");

  }


}