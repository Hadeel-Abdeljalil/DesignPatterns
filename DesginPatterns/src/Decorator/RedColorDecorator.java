/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Decorator.TShirtDecorator;
import Factory.TShirt;
public class RedColorDecorator extends TShirtDecorator {
    public RedColorDecorator(TShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", in Red Color";
    }
}
