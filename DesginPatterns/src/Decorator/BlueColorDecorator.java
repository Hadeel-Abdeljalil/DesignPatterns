/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Factory.TShirt;
public class BlueColorDecorator extends TShirtDecorator {
    
     public BlueColorDecorator(TShirt tShirt) {
        super(tShirt);
    }


    @Override
    public String getDescription() {
        return super.getDescription() + ", in Blue Color";
    }
}
