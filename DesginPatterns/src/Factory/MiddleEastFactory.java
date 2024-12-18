/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author h02ad
 */
public class MiddleEastFactory  extends TShirtFactory{
    
protected TShirt createTShirt(String size) {

	 if (size.equalsIgnoreCase("small")) {
    return new SmallTShirt("Middle East");
    } else if (size.equalsIgnoreCase("medium")) {
      return new MediumTShirt("Middle East");
    } else if (size.equalsIgnoreCase("large")) {
      return new LargeTShirt("Middle East");
    }
    return null;
}
	
}