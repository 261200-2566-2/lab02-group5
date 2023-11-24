// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AirPurifier f = new AirPurifier("Pro", "K69","Pink");
        System.out.print("Model : "+f.model+"\nSerial No. : "+f.serialNo+"\nColor : "+f.color+"\nDimension : "+f.dimension+"\nPrice : "+f.price+"\n");

        System.out.println("Status : "+f.power+"\nFan Speed : "+f.fanspeed+"\n");
        f.turnOn(3);
        System.out.println("Status : "+f.power+"\nFan Speed : "+f.fanspeed+"\n");

        System.out.print("\n----------------------------------\n");

        AirPurifier ranA = new AirPurifier();
        System.out.print("Model : "+ranA.model+"\nSerial No. : "+ranA.serialNo+"\nColor : "+ranA.color+"\nDimension : "+ranA.dimension+"\nPrice : "+ranA.price+"\n");
        System.out.println("Status : "+f.power+"\nFan Speed : "+f.fanspeed+"\n");
        ranA.turnOn(6);
        System.out.println("Status : "+f.power+"\nFan Speed : "+f.fanspeed+"\n");
        System.out.print("\n----------------------------------\n");

    }
}