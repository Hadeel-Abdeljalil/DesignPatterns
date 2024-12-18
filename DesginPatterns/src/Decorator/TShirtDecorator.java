/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Factory.TShirt;

// TShirtDecorator.java
 public abstract class TShirtDecorator extends TShirt {
    protected TShirt decoratedTShirt;

    public TShirtDecorator(TShirt tShirt) {
        super(tShirt.name, tShirt.description);
        this.decoratedTShirt = tShirt;
    }

    @Override
    public String getDescription() {
        return decoratedTShirt.getDescription();
    }

    @Override
    public void formSize() {
        decoratedTShirt.formSize();
    }
}
