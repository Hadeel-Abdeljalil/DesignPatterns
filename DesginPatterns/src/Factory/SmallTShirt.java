/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

public class SmallTShirt extends TShirt {
    public SmallTShirt(String region) {
        super("Small T-shirt", "For " + region);
    }

    @Override
    public void formSize() {
        System.out.println("Small-sized T-shirt for " + description);
    }
}

