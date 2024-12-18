/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author h02ad
 */
public class AisaFacorty extends TShirtFactory {

    protected TShirt createTShirt(String size) {
        if (size.equalsIgnoreCase("small")) {
            return new SmallTShirt("Asia");
        } else if (size.equalsIgnoreCase("medium")) {
            return new MediumTShirt("Asia");
        } else if (size.equalsIgnoreCase("large")) {
            return new LargeTShirt("Asia");
        }
        return null;
    }
}
