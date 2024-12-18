package desginpatterns;

import Decorator.BlueColorDecorator;
import Decorator.TextDecorator;
import Decorator.RedColorDecorator;
import Decorator.LogoDecorator;
import Factory.TShirt;
import Factory.AisaFacorty;
import Factory.ChinaFactory;
import Factory.MiddleEastFactory;
import Observer.SalesTracker;
import Observer.ShopOwner;
import Singelton.TShirtOrderManager;

public class TShirtShopTest {
    public static void main(String[] args) {
        // الحصول على SalesTracker كـ Singleton
        SalesTracker salesTracker = SalesTracker.getInstance();
        ShopOwner shopOwner = new ShopOwner();
        salesTracker.addObserver(shopOwner);

        // تسجيل المصانع
        TShirtOrderManager orderManager = TShirtOrderManager.getInstance();
        orderManager.registerFactory("asia", new AisaFacorty());
        orderManager.registerFactory("china", new ChinaFactory());
        orderManager.registerFactory("middle east", new MiddleEastFactory());

        // إنشاء T-Shirt أول
       
            TShirt blueMediumChina = orderManager.createTShirt("Medium", "China");
            TShirt blueMediumChna = orderManager.createTShirt("Medium", "China");
            blueMediumChina = new LogoDecorator(new RedColorDecorator(blueMediumChina));
            System.out.println(blueMediumChina.getDescription());

            // تسجيل البيع
            salesTracker.recordSale("Medium");

            // إنهاء الطلب الأول
            orderManager.completeOrder();
                   orderManager.completeOrder();


        // إنشاء T-Shirt ثاني
     
            TShirt redLargeMiddleEast = orderManager.createTShirt("Large", "Middle East");
            redLargeMiddleEast = new TextDecorator(new BlueColorDecorator(redLargeMiddleEast));
            System.out.println(redLargeMiddleEast.getDescription());

            // تسجيل البيع
            salesTracker.recordSale("Large");

            // إنهاء الطلب الثاني
            orderManager.completeOrder();
 

        // طباعة المبيعات
        salesTracker.printSales();
    }
}
