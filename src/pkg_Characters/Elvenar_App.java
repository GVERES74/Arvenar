/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Characters;


import java.util.ArrayList;

import java.util.Scanner;


/**
 *
 * @author VERESG
 */
public class Elvenar_App{

    public static void main(String[] args){
    
               
        int opt = 0;
                
        do {
        
        System.out.println("Elvenar Tales by Gabor Veres - 2018 \n");    
        System.out.println("Please choose option:\n 1 - Start Fight \n 2 - Trade \n 3 - Player Stats \n 4 - Exit game \n");
        System.out.println("Waiting for input: ");
                
        Scanner c = new Scanner(System.in);
        opt = c.nextInt();
        
        
            switch (opt){
            case 1: System.out.println("Fighting is on.."); fight(); break;
            case 2: System.out.println("Trading.."); trade(); break;
            case 3: System.out.println("Player Stats.."); stats(); break;
            case 4: System.out.println("Exit.."); break;
                      }         
        
        } 
        while (opt != 4);
        
        System.out.println(opt); 
           
        }
   
     static void fight(){
         Summon_Characters born = new Summon_Characters();   
         int pressanykey =0;
                 
            born.torp.attacksOpponent(born.wolf2);
            born.ember.attacksOpponent(born.wolf1);
            born.elf.attacksOpponent(born.outlaw);
            born.outlaw.attacksOpponent(born.torp);
            born.wolf2.attacksOpponent(born.ember);
            born.bbear1.attacksOpponent(born.elf);
            born.merlin.attacksOpponent(born.ember);
            born.bbear2.attacksOpponent(born.torp);
            born.mage.attacksOpponent(born.bbear2);
            
            do{ 
            System.out.println("The battle has ended.");
                System.out.println("Press \"5\" key to return to Main Menu.");
             
             Scanner key = new Scanner(System.in);
                pressanykey = key.nextInt();
             
    }
            while (pressanykey !=5);
            
     }        
        //PC és NPC adatok          //PC és NPC adatok  

     static void trade(){
         Summon_Characters born = new Summon_Characters();
        
        born.trader.trade_with_Character(born.torp, born.axe);
     }
        
     static void stats(){
       
        Summon_Characters born = new Summon_Characters();
        born.load_inventory(); //inventory -k feltöltése
                
        born.torp.Who_Am_I();
        //born.ember.Who_Am_I();          
        //born.elf.Who_Am_I();
        //born.mage.Who_Am_I();
        
        
       
        born.trader.Who_Am_I();

        born.outlaw.Who_Am_I();
        
        born.merlin.Who_Am_I();
        
        born.wolf1.Who_Am_I();
        born.wolf2.Who_Am_I();
        
        born.bbear1.Who_Am_I();
        born.bbear2.Who_Am_I();
        
        born.ogre1.Who_Am_I();
        
        born.dragon1.Who_Am_I();
    }
      
}



