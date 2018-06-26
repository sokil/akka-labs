package akkalabs;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

import java.io.IOException;

public class App 
{
    public static void main(String[] args)
    {
        // build system
        ActorSystem system = ActorSystem.create("AkkaLabsApplication");

        // add actors
        ActorRef consumerActor = system.actorOf(ConsumerActor.props(), "consumerActor");

        ActorRef producer1Actor = system.actorOf(ProducerActor.props(), "producer1Actor");
        ActorRef producer2Actor = system.actorOf(ProducerActor.props(), "producer2Actor");
        ActorRef producer3Actor = system.actorOf(ProducerActor.props(), "producer2Actor");


        // terminate project
        System.out.println("Press any key to continue...");
        try {
            System.in.read();
        } catch (IOException e) {

        } finally {
            system.terminate();
        }
    }
}
