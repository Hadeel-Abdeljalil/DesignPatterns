/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

 public abstract class TShirtFactory {
     
    protected abstract TShirt createTShirt(String size);
    
    public TShirt orderTShirt(String size){
        TShirt tshirt = createTShirt(size);
        return tshirt;
    }
}
