/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpackage;

import timer.Time;

/**
 *
 * @author Diego
 */
public class Battle {
    
    private int myHP, myAttack, myDefense, myLostHP, rHP, rAttack, rDefense, rLostHP;
    private float myMultiplier, rMultiplier;

    public Battle(int myHP, int myAttack, int myDefense, int myLostHP, float myMultiplier, int rHP, int rAttack, int rDefense, int rLostHP, float rMultiplier) {
        this.myHP = myHP;
        this.myAttack = myAttack;
        this.myDefense = myDefense;
        this.myLostHP = myLostHP;
        this.myMultiplier = myMultiplier;
        this.rHP = rHP;
        this.rAttack = rAttack;
        this.rDefense = rDefense;
        this.rLostHP = rLostHP;
        this.rMultiplier = rMultiplier;
    }
    
    public void fight(int myDamage, int rDamage){
        int speed;
        do{
            speed = (int)(Math.random()*10);
        }while(speed>1);
        multiplier();
        if(speed==1){
            imFaster(myDamage, rDamage);
        }else{
            rIsFaster(myDamage, rDamage);
        }
    }
    
    public void imFaster(int myDamage, int rDamage){
        rLostHP = (int)(rLostHP - ((myAttack/rDefense)*(myDamage*myMultiplier)));
        Time.waitOneSec();
        myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rMultiplier)));
    }
    
    public void rIsFaster(int myDamage, int rDamage){
        myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rMultiplier)));
        Time.waitOneSec();
        rLostHP = (int)(rLostHP - ((myAttack/rDefense)*(myDamage*myMultiplier)));
    }
    
    public void multiplier(){
        do{
            myMultiplier = (float)(Math.random()*10);
            rMultiplier = (float)(Math.random()*10);
        }while(myMultiplier>1.25||myMultiplier<0.75||rMultiplier>1.25||rMultiplier<0.75);
    }
}
