/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

/**
 *
 * @author admin
 */
public class Dog extends Animal implements Eat {

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }
    
}
