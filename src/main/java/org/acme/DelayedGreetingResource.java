package org.acme;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/delayedHello")
public class DelayedGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String delayedHello() {
        System.out.println("received delayed hello request");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        return "Delayed Hello from RESTEasy Reactive";
    }


}
