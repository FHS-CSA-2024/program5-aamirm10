//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args){
        double Rmiles = 286.0;
        int Rgallons = 9;
        double Kmiles = 412.0;
        int Kgallons = 40;
        double Pmiles = 361.0;
        int Pgallons = 18;
        double Bmiles = 161.0;
        int Bgallons = 11;
        double avgR = 0;
        double avgK = 0;
        double avgP = 0;
        double avgB = 0;
        
        // calculations
        
        avgR = (double) (Rmiles / Rgallons * 10 + 0.5); 
        avgR = (int) (Rmiles / Rgallons * 10 + 0.5); 
        avgR = (double) (avgR / 10);
        avgK = (double) (Kmiles / Kgallons * 10 + 0.5);
        avgK = (int) (Kmiles / Kgallons * 10 + 0.5);
        avgK = (double) (avgK / 10);
        avgP = (double) (Pmiles / Pgallons * 10 + 0.5);
        avgP = (int) (Pmiles / Pgallons * 10 + 0.5);
        avgP = (double) (avgP / 10);
        avgB = (double) (Bmiles / Bgallons * 10 + 0.5);
        avgB = (int) (Bmiles / Bgallons * 10 + 0.5);
        avgB = (double) (avgB / 10);
        
        
        
        
        
        
        
        
        
        
        // prints
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println();
        System.out.println("Royal averaged " + avgR + " m/g");
        System.out.println();
        System.out.println("Koopa King averaged " + avgK + " m/g");
        System.out.println();
        System.out.println("Pipe Frame averaged " + avgP + " m/g");
        System.out.println();
        System.out.println("Badwagon averaged " + avgB + " m/g");
        
        
        
        
        
        
        
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royal averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g


*/
