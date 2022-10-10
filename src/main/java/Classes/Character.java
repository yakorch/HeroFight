package Classes;

public class Character {
    int hp;
    int power;

    public Character() {

    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public void kick(Character c) {
        c.setHp(0);
    }

    boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
