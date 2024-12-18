/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;
// LargeTShirt.java
public class LargeTShirt extends TShirt {
    public LargeTShirt(String region) {
        super("Large T-shirt", "For " + region);
    }

    @Override
    public void formSize() {
        System.out.println("Large-sized T-shirt for " + description);
    }
}
