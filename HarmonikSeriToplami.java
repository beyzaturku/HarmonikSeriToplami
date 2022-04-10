package harmoniksayilar;
import java.util.*;
public class HarmonikSayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik Seri Formülü:");
        System.out.println("1+1/2+1/3+1/4+1/5+.....+1/n");
        System.out.println("Bir n sayısı giriniz:");
        int sayi = input.nextInt();
        
        double toplam=0.0;
        for(double i=1; i<=sayi; i++)
        {
            toplam = toplam + 1.0/i;
            
        }
        
        System.out.println("Sonuç:" + toplam );
        
        
        
    }
    
}
