public class AmeliorationBouclier extends Amelioration {
    private final int amelioration;

    AmeliorationBouclier(Robot iRobot, int amelioration) {
        super(iRobot);
        this.amelioration = amelioration;
    }


    @Override
    public int getShield() {
        return super.getShield()*amelioration;
    }
}
