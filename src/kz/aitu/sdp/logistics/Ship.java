package kz.aitu.sdp.logistics;

public class Ship implements Transport {

    private final String routeType = "sea route";

    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Ship delivers " + cargo + " to " + destination
                + " by " + routeType + " (cargo hold, port to port)");
    }
}