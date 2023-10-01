public class Fire extends Pokemon{

    private boolean hasExternalFlame;
    private boolean hasTrainer;



    public Fire(String name, int level, String sound, boolean hasExternalFlame, boolean hasTrainer) {
        super(name, level, sound);
        this.hasExternalFlame = hasExternalFlame;
        this.hasTrainer = hasTrainer;

    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats fire-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Water-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Grass-type");

    }

    public boolean isHasExternalFlame() {
        return hasExternalFlame;
    }

    public void setHasExternalFlame(boolean hasExternalFlame) {
        this.hasExternalFlame = hasExternalFlame;
    }

    public String isHasTrainer() {
//        return hasTrainer;

    if (hasTrainer ){
        return " has a trainer";

    }
    else {
        return " is a wild Pokemon";
    }
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }
}
