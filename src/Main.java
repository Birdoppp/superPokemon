public class Main {
    public static void main(String[] args) {


    Fire Charmander = new Fire("Charmander" ,11,"char-char", true, false);

    Charmander.eats();
    System.out.println(Charmander.getName() + " says " +Charmander.getSound() +" and"+ Charmander.isHasTrainer());

    Charmander.setSound("Graaa!!");
        System.out.println(Charmander.getName() + "'s battle-cry is "+ Charmander.getSound());

    Electric Pikachu = new Electric("Pikachu", 16, "Pika-pika");

    Pikachu.sleep();


    Electric Pichu = new Electric("Pichu", 7 , "Chu-chu~");

    Pichu.strongAgainst();

    Water Chinchou = new Water("Chinchou", 22, "Chin-chin", "Electric");

        System.out.println(Chinchou.getName() + "'s type is "+  Chinchou.getSecondType());
        System.out.println(Chinchou.getName() + "'s level is "+ Chinchou.getLevel());

    }

}
