/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Decorator.TShirtDecorator;
import Factory.TShirt;

// TextDecorator.java
 public class TextDecorator extends TShirtDecorator {
    public TextDecorator(TShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Text: 'Nice Day!'";
    }
}

