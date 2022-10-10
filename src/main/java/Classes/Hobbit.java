package Classes;

public class Hobbit extends Character{
    public Hobbit(){
        hp = 3;
        power = 0;
    }

    @Override
    public void kick(Character c){
        toCry(c);
    }

    private void toCry(Character ch){
        if (ch instanceof Hobbit){
            setHp(0);
            System.out.println("I resign))");
        }
        else{
        System.out.println("OHHH MY GODDD I'M DYING :::===(((((");
        }
    }
}
