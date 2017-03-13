/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpackage;

/**
 *
 * @author Diego
 */
public class Battle {
    
    private int myHP, myAttack, myDefense, myLostHP, rHP, rAttack, rDefense, rLostHP;
    private float myMultiplier, rMultiplier;
    private boolean victory, defeat;
    

    public Battle(int myHP, int myAttack, int myDefense, int rHP, int rAttack, int rDefense) {
        this.myHP = myHP;
        this.myAttack = myAttack;
        this.myDefense = myDefense;
        this.myLostHP = myHP;
        this.myMultiplier = 1;
        this.rHP = rHP;
        this.rAttack = rAttack;
        this.rDefense = rDefense;
        this.rLostHP = rHP;
        this.rMultiplier = 1;
        victory=false;
        defeat=false;
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
        if(rLostHP>0){
            myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rMultiplier)));
            if(myLostHP<=0){
                defeat=true;
            }
        }else{
            victory = true;
        }
    }
    
    public void rIsFaster(int myDamage, int rDamage){
        myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rMultiplier)));
        if(myLostHP>0){
            rLostHP = (int)(rLostHP - ((myAttack/rDefense)*(myDamage*myMultiplier)));
            if(rLostHP<=0){
                victory=true;
            }
        }else{
            defeat=true;
        }
    }
    
    public void multiplier(){
        do{
            myMultiplier = (float)(Math.random()*10);
            rMultiplier = (float)(Math.random()*10);
        }while(myMultiplier>1.25||myMultiplier<0.75||rMultiplier>1.25||rMultiplier<0.75);
    }
}
