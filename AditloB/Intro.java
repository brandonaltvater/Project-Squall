package AditloB;

import java.util.concurrent.TimeUnit;

/**
 * Created by Brandon.Altvater on 6/14/2017.
 */
public class Intro {
    public static void intro() throws InterruptedException {
        Print.printString("Welcome to a day in the life of Brendan!\n(Queue background music)");

        TimeUnit.SECONDS.sleep(3);

        Print.printString("");
    }
}
