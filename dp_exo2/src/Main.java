import java.io.IOException;
import strategy.LengthStrategy;
import strategy.PalindromeStrategy;
import strategy.StartWithStrategy;

public class Main {

  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage : java ListerMots1 fichier");
      System.exit(1);
    }
    ListerMots listerMots = new ListerMots(args[0]);
    System.out.println("🟨LengthStrategy(5)");
    listerMots.imprimerSiStrategy(new LengthStrategy(5));
    System.out.println("🟨PalindromeStrategy()");
    listerMots.imprimerSiStrategy(new PalindromeStrategy());
    System.out.println("🟨StartWithStrategy('k')");
    listerMots.imprimerSiStrategy(new StartWithStrategy('k'));

  }
}
// TODO 23-09-24 : faire le dp2 2.2