package com.claseufpso.ejercicio1;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Character homero = new Character("Homero",39,'M',"A la grande le puse cuca");
        homero.saySomething();
        
        Character bart = new Character("Bart",10,'M',"Ay caramba!");
        bart.saySomething();
        
        Character lisa = new Character("Lisa",8,'F',"de hecho");
        lisa.saySomething();
        
    }
        
        static class Character{
            String name;
            int age;
            char gender;
            String phrase;

            public Character(String name, int age, char gender, String phrase) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.phrase = phrase;
            }
            
            void saySomething(){
                System.out.println(this.phrase);
            }
        }
        
    }

