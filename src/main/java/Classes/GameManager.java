package Classes;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        int counter = 0;
        while (c1.isAlive() && c2.isAlive()){
            System.out.println("Player 1 info: hp / power");
            System.out.println(c1.getHp());
            System.out.println(c1.getPower());

            System.out.println("Player 2 info: hp / power");
            System.out.println(c2.getHp());
            System.out.println(c2.getPower());


            if (counter % 2 == 0) {
                System.out.println("First hits...");
                c1.kick(c2);
            }
            else {
                System.out.println("second hits...");
                c2.kick(c1);
            }
            counter += 1;
        }

        if (c1.isAlive()){
            System.out.println("First player won!!!");
        }
        else {
            System.out.println("Second player won!!!");
        }
    }

    public static void main(String[] args) {
        Character first = CharacterFactory.createCharacter();
        Character second = CharacterFactory.createCharacter();
        fight(first, second);
    }
}
