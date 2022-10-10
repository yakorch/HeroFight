package Classes;


public class King extends Character{
    public King() {
        hp = (int) (Math.random() * 11 + 5);
        power = (int) (Math.random() * 11 + 5);
    }

    public void kick(Character c){
        c.setHp(c.getHp() - power);
    }
}
