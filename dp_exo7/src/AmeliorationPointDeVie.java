public class AmeliorationPointDeVie extends Amelioration {
    private final int amelioration;

    AmeliorationPointDeVie(Robot iRobot, int amelioration) {
        super(iRobot);
        this.amelioration = amelioration;
    }

    @Override
    public int diffLife(int i) {
        if (i<1){
            return super.diffLife(i);
        }
        return super.diffLife(i/amelioration);
    }
}
