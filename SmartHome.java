abstract class Device{
    public abstract void turnOn();
    String brand;
    Device(String brand){
        this.brand=brand;
    }
}

interface RemoteControllable{
    void connecttoWifi();

}
interface PowerSaving{
    void getEnergyRating();

}
class SmartTV extends Device implements RemoteControllable,PowerSaving{
    SmartTV(String brand){
        super(brand);
    }
    @Override
    public void turnOn() {
        System.out.println("TV booting up");
    }
    @Override
    public void connecttoWifi(){
        System.out.println("Connecting to WiFi");
    }
    @Override
    public void getEnergyRating(){
        System.out.println("Energy rating:A");
    }
}
class ElectricKettle extends Device{
    ElectricKettle(String brand){
        super(brand);
    }
    @Override
    public void turnOn(){
        System.out.println("Kettle on");
    }
}
public class SmartHome{
    public static void main(String[] args){
        Device d=new SmartTV("Sony");
        d.turnOn();
        RemoteControllable r = new SmartTV("LG");
        r.connecttoWifi();  
        PowerSaving p = new SmartTV("Samsung");
        p.getEnergyRating();
        Device q=new ElectricKettle("Philips");
        q.turnOn();
    }
}