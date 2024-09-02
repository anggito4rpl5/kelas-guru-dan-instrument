package Latihan;
import java.util.Scanner;

public class PlayInstrumen {
   

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Instrumen a = new Instrumen();
        Instrumen b = new Instrumen("Piano", 200.0);
        Instrumen c = new Instrumen("Violin", 150.0);

        a.setType("Guitar");
        a.setPrice(101.5);

        
        a.print();
        b.print();
        c.print();

        
    }
    
}

