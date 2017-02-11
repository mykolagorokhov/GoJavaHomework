package modul03.task031;

/**
 * Created by MYKOLA.GOROKHOV on 08.02.2017.
 * <p>
 * You must add a sing method to the Bird class, then modify the main method accordingly so
 * that the code prints the following lines:
 * I am walking
 * I am flying
 * I am singing
 * I am Bird
 */
public class Bird {
    final private String string = "I am walking\nI am flying\nI am singing\nI am Bird";

    public static void main(String[] args) {

        System.out.println("Without name");
        Bird bird = new Bird();
        bird.sing();

        System.out.println("With name");
        Bird birdVoody = new Bird("Voody");
        birdVoody.sing();
    }

    public Bird(String BirdName) {
        System.out.println("I am " + BirdName);

    }

    public Bird() {
    }

    public void sing() {
        System.out.println(string);
    }
}


