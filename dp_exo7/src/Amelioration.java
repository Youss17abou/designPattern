public abstract class Amelioration implements Robot {//pattern decorator
    private final Robot iRobot;


    Amelioration(Robot iRobot) {
        this.iRobot = iRobot;
    }

    @Override
    public int diffLife(int i) {
        return iRobot.diffLife(i);
    }
    @Override
    public String getName() {
        return iRobot.getName();
    }

    @Override
    public int getFreq() {
        return iRobot.getFreq();
    }

    @Override
    public int getShield() {
        return iRobot.getShield();
    }

    @Override
    public int getCanon() {
        return iRobot.getCanon();
    }
}
