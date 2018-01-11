/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author oscar
 */
public class LvRigacodingDay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square s1 = new Square(5, "red");
        Square s2 = new Square(20, "green");
        
        System.out.println("Kvadrāta 1 krāsa ir " + s1.getColor());
        
        System.out.println("Kvadrāta 2 laukums ir " + s2.getArea());
        
        System.out.println("Kvadrāta 2 perimetrs ir " + s2.getPerimeter());
       
       Adrese vieta = new Adrese();
        vieta.valsts = "Kambodža";
        vieta.pilsēta = "Bubu";
        vieta.mājasnr = "14";
        vieta.iela = "Dzeveņu";
        vieta.dzivokļanr = "12";
        
        Nodaļa it = new Nodaļa();
        it.Nosaukums = "Java";
        it.Darbinieki = 12;
        it.Atrašanāsvieta = vieta;
        
         
        Darbinieks user1 = new Darbinieks();
        user1.vārds = "Jānis";
        user1.uzvārds = "Lasis";
        user1.dzimšanasgads = 1989;
        user1.epasts = "kakis123@inbox.lv";
        user1.tālrunis = "22211313";
        user1.aktuālānodaļa = it;
        user1.iepriekšējānodaļa = it;
        user1.dzīvesvieta = vieta;
        
        System.out.println("Mani sauc " + user1.vārds + " es dzīvoju " + user1.dzīvesvieta.getAdrese());
        System.out.println(
                "Mani sauc " + user1.vārds +
                " un es pārgāju " + "uz " +
                user1.aktuālānodaļa.Nosaukums +
                "no " +
                user1.iepriekšējānodaļa.Nosaukums + " kurā bija " + 
        user1.iepriekšējānodaļa.Darbinieki + 
                " un atradās " + it.Atrašanāsvieta.getAdrese() );
        
    }
    
    
    
}
