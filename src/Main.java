public class Main {
    public static void main(String[] args) {


    Fire Charmander = new Fire("Charmander" ,11,"char-char", true, false);

    Charmander.eats();
    System.out.println(Charmander.getName() + " " +Charmander.getSound() + Charmander.isHasTrainer());

    Charmander.setSound("Graaa!!");
        System.out.println(Charmander.getSound());

    Electric Pikachu = new Electric("Pikachu", 16, "Pika-pika");

    Pikachu.sleep();


    Electric Pichu = new Electric("Pichu", 7 , "Chu-chu~");

    Pichu.strongAgainst();

    Water Chinchou = new Water("Chinchou", 22, "Chin-chin", "Electric");

        System.out.println(Chinchou.getName() + "'s type is "+  Chinchou.getSecondType());
    }

}
