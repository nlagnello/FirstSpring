/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspring;

/**
 *
 * @author nagnello
 */
public class Dog implements Animal{

    @Override
    public void speak() {
         System.out.println("Bark");
    }
    
}
