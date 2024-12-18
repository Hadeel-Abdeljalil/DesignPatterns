/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import Observer.Observer;

public class ShopOwner implements Observer {
    @Override
    public void update(String size, int totalSales) {
        System.out.println("Update: Sold " + totalSales + " items of size " + size);
    }
}
