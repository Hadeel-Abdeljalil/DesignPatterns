/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import Observer.Observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesTracker implements Subject {
    private static SalesTracker instance; // الكائن الوحيد
    private final Map<String, Integer> sales = new HashMap<>();
    private final List<Observer> observers = new ArrayList<>();

    // منع إنشاء كائنات جديدة
    private SalesTracker() { }

    // الحصول على الكائن الوحيد
     public static SalesTracker getInstance() {
        if (instance == null) {
            synchronized (SalesTracker.class) {
                if (instance == null) {
                    instance = new SalesTracker();
                }
            }
        }
        return instance;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String size) {
        for (Observer observer : observers) {
            observer.update(size, sales.get(size));
        }
    }

    public void recordSale(String size) {
        sales.put(size, sales.getOrDefault(size, 0) + 1);
        notifyObservers(size);
    }
        public void printSales() {
        System.out.println("Sales Summary:");
        sales.forEach((size, count) -> System.out.println(size + ": " + count + " sold"));
    }
}
