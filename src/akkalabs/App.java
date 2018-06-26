package akkalabs;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

import java.io.IOException;

public class App 
{
    public static void main(String[] args)
    {
        final ActorSystem system = ActorSystem.create("helloakka");

        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }
}
