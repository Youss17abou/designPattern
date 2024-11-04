public class RobotImpl implements Robot {
    private String name;
    private int pointDeVie;
    private int puissanceBouclier;
    private int freq;
    private int puissanceCanon;

    public RobotImpl(RobotBuilder robotBuilder) {
        this.name = robotBuilder.name;
        this.pointDeVie = robotBuilder.pointDeVie;
        this.puissanceBouclier = robotBuilder.puissanceBouclier;
        this.freq = robotBuilder.freq;
        this.puissanceCanon = robotBuilder.puissanceCanon;
    }

    @Override
    public int getCanon() {
        return this.puissanceCanon;
    }

    @Override
    public int getShield() {
        return this.puissanceBouclier;
    }

    @Override
    public int getFreq() {
        return this.freq;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int diffLife(int i) {
        this.pointDeVie += i;
        return this.pointDeVie;
    }

    public static class RobotBuilder {
        private String name;
        private int pointDeVie;
        private int puissanceBouclier;
        private int freq;
        private int puissanceCanon;

        public RobotBuilder(String name) {
            this.name = name;
            this.pointDeVie = 100;
            this.puissanceBouclier = 1;
            this.freq = 100;
            this.puissanceCanon = 1;
        }
        public RobotBuilder withPointDeVie(int pointDeVie) {
            this.pointDeVie = pointDeVie;
            return this;
        }
        public RobotBuilder withPuissanceBouclier(int puissanceBouclier) {
            this.puissanceBouclier = puissanceBouclier;
            return this;
        }
        public RobotBuilder withFreq(int freq) {
            this.freq = freq;
            return this;
        }
        public RobotBuilder withPuissanceCanon(int puissanceCanon) {
            this.puissanceCanon = puissanceCanon;
            return this;
        }

        public RobotImpl build() {
            return new RobotImpl(this);
        }


    }
}
