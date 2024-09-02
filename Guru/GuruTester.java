package Guru;

import java.util.Scanner;

public class GuruTester {
//1.NIPbu
//2.NAMA
//3.MAPEL
//4.STATUS

    public static void main(String[] args) {
        //String--> double
         Scanner input = new Scanner (System.in);
    System.out.println("Nama = ");
    String nama = input.nextLine();
    System.out.println("Mapel  = ");
    String mapel = input.nextLine();
    System.out.println("Status  = ");
    String status = input.nextLine();
    System.out.println("NIP=");
    int nip = input.nextInt();
    input.close();

    // Guru guru = new Guru (nip, nama, mapel, status);

    // guru.print();
    







        // Guru PakNico = new Guru (1121,"Pak Nico", "Olahraga", "tetap" );
        // Guru BuPasha = new Guru (1122, "Bu Pasha", "Rpl", "Tetap");
        // Guru PakAndre = new Guru (1123, "Pak Andre ", "Bahasa Inggris", "Full Time");
        // Guru PakTulus = new Guru (1124, "Pak Tulus", "ipas", "Full Time");
        // Guru PakMunif = new Guru (1125, "Pak Munif", "PAI", "Full Time");



        Guru BuPasha = new Guru(3456, "Pasha", "RPL", "Tetap");

        BuPasha.setNama("Bu Pasha");
        BuPasha.setMapel("RPL");
        BuPasha.setStatus("Tetap");
        BuPasha.setNip(3456);

        BuPasha.print();
    
        
 




        
    }
}
