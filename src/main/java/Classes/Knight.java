package Classes;


public class Knight extends Character{
    public Knight(){
        hp = (int) (Math.random() * 11 + 2);
        power = (int) ((Math.random() * 11) + 2);
    }

    public void kick(Character c){
        c.setHp(c.getHp() - power);
    }
}
