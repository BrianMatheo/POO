package com.claseufpso.ejercicio1;

import people.Character;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Character homero = new Character("Homero",39,'M',"A la grande le puse cuca");
        homero.saySomething();
        
        Character bart = new Character("Bart",10,'M',"Ay caramba!");
        bart.saySomething();
        
        Character lisa = new Character("Lisa",8,'F',"De hecho");
        lisa.saySomething();
        
        Character apu = new Character();
        apu.setName("Apu Nahasapeemapetilon");
        apu.setPhrase("Vuelvas prontos");
        apu.saySomething();
    }        
}