abstract class Robot{
    private String batteryId;
    protected double chargeLevel;
    Robot(String batteryId,double chargeLevel){
        this.batteryId=batteryId;
        this.chargeLevel=chargeLevel;
    }
    void reportStatus(){
        System.out.println("Battery ID: " + batteryId);
        System.out.println("Charge Level: " + chargeLevel);
    }
    abstract double performTask();
    String getBatteryId(){
        return batteryId;
    }
    double getChargeLevel(){
        return chargeLevel;
    }

}
class DroneBot extends Robot{
    DroneBot(String batteryId,double chargeLevel){
        super(batteryId,chargeLevel);
    }
    @Override
    double performTask(){
        if(chargeLevel>15){
            chargeLevel=chargeLevel-15;
            return chargeLevel;
        }
        else{
            System.out.println("Low battery!");
        }
        return 0;
    }
}
class GroundBot extends Robot{
    GroundBot(String batteryId,double chargeLevel){
        super(batteryId,chargeLevel);
    }
    @Override
    double performTask(){
        if(chargeLevel>5){
            chargeLevel=chargeLevel-5;
            return chargeLevel;
        }else{
            System.out.println("Low battery!");
        }
        return 0;
    }
}
public class WarehouseFleet{
    public static void main(String[] args) {
        Robot[] fleet = { new DroneBot("D-1", 20), new GroundBot("G-5", 10),new DroneBot("D-2",5) };
        for (Robot r : fleet) {
            r.performTask();
            r.reportStatus();
        }

    }
}