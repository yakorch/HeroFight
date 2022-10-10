package Classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;
import org.reflections.*;

public class CharacterFactory {

    public static Character createCharacter() {
        Reflections reflections = new Reflections("");
        Set<Class<? extends Character>> subTypes =
                reflections.getSubTypesOf(Character.class);
        Random rand = new Random();
        int num = rand.nextInt(subTypes.size());
        Class arr[] = new Class[subTypes.size()];
        int i = 0;
        for (Class c:
             subTypes) {
            arr[i] = c;
            i += 1;
        }

        try{
        Class chosen = arr[num];
        Constructor constructor = chosen.getConstructor();
        return (Character) constructor.newInstance();
        }
        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException error) {
            System.out.println("LOL");
            return new Character();
        }
    }

    public static void main(String[] args) {
        System.out.println(createCharacter());
    }
}
