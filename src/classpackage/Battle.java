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
    
    private int myHP, myAttack, myDefense, myLostHP, myMultipier, rHP, rAttack, rDefense, rLostHP, rMultiplier;

    public Battle(int myHP, int myAttack, int myDefense, int myLostHP, int myMultipier, int rHP, int rAttack, int rDefense, int rLostHP, int rMultiplier) {
        this.myHP = myHP;
        this.myAttack = myAttack;
        this.myDefense = myDefense;
        this.myLostHP = myLostHP;
        this.myMultipier = myMultipier;
        this.rHP = rHP;
        this.rAttack = rAttack;
        this.rDefense = rDefense;
        this.rLostHP = rLostHP;
        this.rMultiplier = rMultiplier;
    }
    
    public void fight(int myDamage, int rDamege){
        int speed;
        do{
            speed = (int)(Math.random()*10);
        }while(speed>1);
        if(speed==1){
            
        }else{
            
        }
    }
    
    
}
