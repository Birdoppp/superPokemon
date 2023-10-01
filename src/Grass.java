public class Grass extends Pokemon{
    public Grass(String name, int level, String sound) {
        super(name, level, sound);
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats grass-berries");

    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Fire-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Water-type");

    }

}
