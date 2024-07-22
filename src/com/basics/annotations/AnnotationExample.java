package src.com.basics.annotations;

import java.lang.annotation.*;

//@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Player{
    int age() default 25;
    String name() default "Bichel";
}

@Player
class Cricketer{

    private int matches;
    private int runs;

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        Cricketer cricketer = new Cricketer();
        cricketer.setMatches(100);
        cricketer.setRuns(25000);
        System.out.println(cricketer.getMatches());
        System.out.println(cricketer.getRuns());

        Annotation annotation = cricketer.getClass().getAnnotation(Player.class);
        Player player = (Player)annotation;
        System.out.println(player.age());
        System.out.println(player.name());

    }
}
