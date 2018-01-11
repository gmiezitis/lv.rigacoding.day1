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
public class Adrese {
    public String valsts;
    
    public String pilsēta;
    
    public String iela;
    
    public String mājasnr;
    
    public String dzivokļanr;
    
    
    public Adrese(){
       
    }
   public String getAdrese(){
       //jauns mainigais tukss strings
       String fullAdrese = "";
       if(valsts != null && valsts != ""){
           fullAdrese += valsts + ", ";
           // sis ir tas pats kas += 
           // fullAdrese +=fullAdrese + valsts + ", ";
           
       }
       //!= nozime nav vienads
       if(pilsēta != null && pilsēta != ""){
           fullAdrese += pilsēta + ", ";
       }
       //"Latvija, Riga, ja bus lielaks par nulli pec pievienosanas atmetam pedejos divus simbolus"
       if(fullAdrese.length() > 0){
           fullAdrese = fullAdrese.substring(0, fullAdrese.length() - 2);
           
       
       }
       return fullAdrese;
   }
           
   
}
