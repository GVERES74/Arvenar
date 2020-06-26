/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Characters;

import pkg_Items.potions.*;
import pkg_Items.weapons.*;

/**
 *
 * @author VERESG
 */
public class Summon_Characters {
    
    
     //Inventory: Fegyverek létrehozása    
        Weapons_One_Handed sword = new Weapons_One_Handed("Sword","Rusty sword", 6, 9, 13, "slashing");
        Weapons_One_Handed knife = new Weapons_One_Handed("Knife","Bread slicer", 1, 4, 3, "slicing");
        Weapons_Staff staff = new Weapons_Staff("Staff","Firemage staff", 8, 15, 18, "casting fire");
        Weapons_Two_Handed cleaver = new Weapons_Two_Handed("Cleaver","Big Cleaver", 11, 25, 28, "chopping");
        Weapons_Two_Handed axe = new Weapons_Two_Handed("Axe","Golden Axe", 21, 28, 26, "cutting");
        Weapons_Ranged bow = new Weapons_Ranged("Bow","Ice arrows", 13, 16, 22, "shooting");
        Weapons_Magic fireball = new Weapons_Magic("Fireball","Fireball", 5, 9, 0, "burning");
        
    //Állatok "fegyvere", ezek fixek, nincs értelme paraméterezni
        Weapons_Animal_Teeth teeth = new Weapons_Animal_Teeth();
        Weapons_Animal_Claws claws = new Weapons_Animal_Claws();
        
    //Szörnyek "fegyvere", ezek fixek, nincs értelme paraméterezni
        Weapons_Monster_Weapon ogre_fist = new Weapons_Monster_Weapon("fist", 20, 26, "punching you");
        Weapons_Monster_Weapon dragon_fire = new Weapons_Monster_Weapon("fire", 32, 42, "burning you to ash");
        
    //Inventory: Potionok létrehozása
        Potions_Healing healing = new Potions_Healing("Lesser healing potion", "Heal wounds", 2, 4, "healing you");
        
    //Játszható karakter "Hero" létrehozása
        PC_Dwarf torp = new PC_Dwarf("Male", "Otli", 33, "Weaponsmith", axe, healing, 50, 25);
        PC_Human ember = new PC_Human("Female", "Riana", 26, "Rogue", sword, healing, 34, 20);
        PC_Elf elf = new PC_Elf("Male", "Legolas", 83, "Archer", bow, healing, 52, 28);
        PC_Human mage = new PC_Human("Female", "Morgana", 27, "Fire mage", fireball, healing, 40, 23);
        
     //NPC -k létrehozása   
        //Kereskedők
        
        Npc_Human_Trader trader = new Npc_Human_Trader("Rosalinda", "Human", "Trader", knife, 100);
        
              
        
        //Ellenségek
        
        Npc_Human_Bandit outlaw = new Npc_Human_Bandit("Caligula", "Human", "Bandit Outlaw", cleaver, cleaver.getWeapon_say(),100);
        
        Npc_Human_Mage merlin = new Npc_Human_Mage("Merlino", "Human", "Mage Inquisitor", staff, staff.getWeapon_say(),100);
        
        Npc_Animal_Wolf wolf1 = new Npc_Animal_Wolf("Sharpteeth", "Beast", "Gray wolf", teeth, teeth.getWeapon_say(), 100);
        Npc_Animal_Wolf wolf2 = new Npc_Animal_Wolf("Bigteeth", "Beast", "Wolf pack leader", teeth, teeth.getWeapon_say(), 120);
        
        Npc_Animal_Bear bbear1 = new Npc_Animal_Bear("Old razorclaw", "Beast", "Brown bear", claws, claws.getWeapon_say(), 150);
        Npc_Animal_Bear bbear2 = new Npc_Animal_Bear("Big paw", "Beast", "Grizzly bear", claws, claws.getWeapon_say(), 170);

        Npc_Monster_Ogre ogre1 = new Npc_Monster_Ogre("Gorka", "Monster", "Cave Ogre", ogre_fist, ogre_fist.getWeapon_say(), 200);
        
        Npc_Monster_Dragon dragon1 = new Npc_Monster_Dragon("Azariel", "Monster", "Fire Dragon", dragon_fire, dragon_fire.getWeapon_say(), 300);
        
        //Inventory -k feltöltése
        public void load_inventory(){
        
        //trader.addItemToInventory("Name: "+knife.getName()+" \n\tDescription: "+knife.getDescription()+" \n\tClass: "+knife.getWeapon_class()+" \n\tBuy value: "+knife.getBuyValue()+" \n\tSell value: "+knife.getSellValue()+" \n\tMin. damage: "+knife.getMin_damage()+" \n\tMax. damage: "+knife.getMax_damage());
        trader.addItemToInventory(knife.getName());
        trader.addItemToInventory(sword.getName());
        trader.addItemToInventory(staff.getName());
        trader.addItemToInventory(cleaver.getName());
        trader.addItemToInventory(axe.getName());
        trader.addItemToInventory(bow.getName());
        trader.addItemToInventory(healing.getName());
                
        torp.addItemToInventory(healing.getName());
        torp.addItemToInventory(axe.getName());
        torp.addItemToInventory(cleaver.getName());
        
        }
        

}
