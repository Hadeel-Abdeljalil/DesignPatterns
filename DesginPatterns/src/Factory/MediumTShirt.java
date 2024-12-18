/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

// MediumTShirt.java
public class MediumTShirt extends TShirt {
    public MediumTShirt(String region) {
        super("Medium T-shirt", "For " + region);
    }

    @Override
    public void formSize() {
        System.out.println("Medium-sized T-shirt for " + description);
    }
}
