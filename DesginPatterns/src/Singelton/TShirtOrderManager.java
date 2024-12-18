package Singelton;

import Factory.TShirt;
import Factory.TShirtFactory;

import java.util.HashMap;
import java.util.Map;

public class TShirtOrderManager {
    private static volatile TShirtOrderManager instance;
    private TShirt currentOrder;

    // خريطة لتسجيل المصانع حسب المنطقة
    private final Map<String, TShirtFactory> factoryRegistry = new HashMap<>();

    private TShirtOrderManager() {}

    public static TShirtOrderManager getInstance() {
        if (instance == null) {
            synchronized (TShirtOrderManager.class) {
                if (instance == null) {
                    instance = new TShirtOrderManager();
                }
            }
        }
        return instance;
    }

    // تسجيل مصنع جديد
    public void registerFactory(String region, TShirtFactory factory) {
        factoryRegistry.put(region.toLowerCase(), factory);
    }

    public TShirt createTShirt(String size, String region) {
        if (currentOrder != null) {
            System.out.println("An order is already in progress. Complete it before creating a new one.");
        }

        // الحصول على المصنع المناسب من الخريطة
        TShirtFactory factory = factoryRegistry.get(region.toLowerCase());
        if (factory == null) {
            System.out.println("No factory registered for region: " + region);
        }

        currentOrder = factory.orderTShirt(size);
        return currentOrder;
    }

    public void completeOrder() {
        if (currentOrder == null) {
            System.out.println("No order in progress to complete.");
        }
        currentOrder = null;
    }
}
