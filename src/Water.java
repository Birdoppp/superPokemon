public class Water extends Pokemon{

    private String secondType;
    public Water(String name, int level, String sound) {
        super(name, level, sound);
    }

    public Water(String name, int level, String sound,String secondType) {
        super(name, level, sound);
        this.secondType = secondType;
    }


    @Override
    public void eats() {
        System.out.println(getName() + " eats Water-berry");

    }


    public void weakness() {
        System.out.println(getName() + " has a weakness to Grass-type");

    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Fire-type");

    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }
}
