package kz.aitu.sdp.logistics;

public abstract class Logistics {

    protected abstract Transport createTransport();

    public void planDelivery(String cargo, String destination) {
        Transport transport = createTransport();
        System.out.println("Planning delivery of " + cargo + " to " + destination);
        transport.deliver(cargo, destination);
    }
}