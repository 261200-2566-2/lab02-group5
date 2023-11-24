import java.util.Random;
public class AirPurifier {
    String model;
    String serialNo;
    String color;
    String dimension;
    int price;
    int fanspeed;


    boolean power;
    void turnOn(int fanspeed) {
        power = true;
        if(6>fanspeed&&fanspeed>0)  this.fanspeed = fanspeed;
        else{
            System.out.println("False Speed... Go randommm");
            turnOn();
        }
    }

    void turnOn() {
        power = true;
        Random rand = new Random();
        fanspeed    = rand.nextInt(5)+1;
    }
    void turnOff() {
        power = false;
        fanspeed = 0;
    }

    AirPurifier(String model,
                String serialNo, String color) {
        this.model      = model;
        this.serialNo   = serialNo;
        this.color      = color;
        if(model == "Pro" && serialNo == "K69"){
            dimension  = "25*25*75";
            price      =  20000;
        }
        else if(model=="Save" && serialNo == "K30"){
            dimension  = "20*20*40";
            price      =  7500;
        }
        else if(model=="Performance" && serialNo == "K59"){
            dimension  = "20*20*50";
            price      =  15000;
        }

    }
    AirPurifier() {
        Random rand = new Random();
        int  x = rand.nextInt(3);
        if(x==0){
            this.model      = "Pro";
            this.serialNo   = "K69";
            this.color      = "Red";
            this.dimension  = "25*25*75";
            this.price      =  20000;
        }
        else if(x==1){
            this.model      = "Save";
            this.serialNo   = "K30";
            this.color      = "White";
            this.dimension  = "20*20*40";
            this.price      =  7500;
        }
        else if(x==2){
            this.model      = "Performance";
            this.serialNo   = "K59";
            this.color      = "Black";
            this.dimension  = "22*22*50";
            this.price      =  15000;
        }
    }

}
