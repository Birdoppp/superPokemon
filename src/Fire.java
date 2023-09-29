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


}
