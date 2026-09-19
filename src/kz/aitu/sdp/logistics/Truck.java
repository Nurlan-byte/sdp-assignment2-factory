package kz.aitu.sdp.logistics;

public class Truck implements Transport {

    private final String routeType = "road route";

    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Truck delivers " + cargo + " to " + destination
                + " by " + routeType + " (container on wheels)");
    }
}