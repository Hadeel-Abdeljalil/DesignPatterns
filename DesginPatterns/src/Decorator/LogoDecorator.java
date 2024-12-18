/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Factory.TShirt;

// LogoDecorator.java
 public class LogoDecorator extends TShirtDecorator {
    public LogoDecorator(TShirt tShirt) {
        super(tShirt);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Bird Logo";
    }
}
