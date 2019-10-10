package tugasscanner;
import java.util.Scanner;
public class Mainjava {
    public static void main(String[] args) {
        System.out.println("======Status Staff=======");
        System.out.print("Masukan nama = ");
        Scanner Who = new Scanner(System.in);
        String nama;
        nama = Who.next();
        
        
        switch(nama){
            case "tirta" :
                System.out.println("=============================");
                System.out.println("Name   = Muhammad Tirta Syakban");
                System.out.println("NIM    = 11950115140");
                System.out.println("Class  = F");
                System.out.println("Status = Admin");
                System.out.println("        Salam Kenal Gays        ");
                System.out.println("=============================");
                break;
            case "jomblo" :
                System.out.println("=============================");
                System.out.println("Ya maap kl staffnya jomblo");
                System.out.println("=============================");
                break;
            case "bucin" :
                System.out.println("=============================");
                System.out.println("Dih ngebucin mulu");
                System.out.println("=============================");
                break;
            default  :
                System.out.println("=============================");
                System.out.println("Maaf, anda bukan bagian admin");
                System.out.println("=============================");
        }
    }
    
}
