

abstract class Transport{
    String trackingId;
    String destination;
    abstract void dispatch();
    Transport(String trackingId,String destination){
        this.trackingId=trackingId;
        this.destination=destination;
    }
    public String getTrackingId() {
        return trackingId;
    }
    public String getDestination() {
        return destination;
    }
}
interface GPS{
    void getCoordinates();
}

interface Autonomous{
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS,Autonomous{
    public DeliveryDrone(String trackingId,String destination){
        super(trackingId,destination);
    }
    @Override
    public void getCoordinates(){
        System.out.println("40.7128 N, 74.0060 W");
    }
    @Override
    public void selfNavigate(){
        System.out.println("Starting self navigation");
    }
    @Override
    public void dispatch(){
        System.out.println("Tracking ID:"+trackingId);
        System.out.println("Destination:"+destination);
    }
}
public class SmartLogistics{
    public static void main(String[] args){
        Transport t=new DeliveryDrone("D101","New York");
        t.dispatch();
        GPS g=new DeliveryDrone("D101","New York");
        g.getCoordinates();
        Autonomous a=new DeliveryDrone("D101","New York");
        a.selfNavigate();
    }
}