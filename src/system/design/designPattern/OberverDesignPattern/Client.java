package system.design.designPattern.OberverDesignPattern;

import system.design.designPattern.OberverDesignPattern.Observable.IphoneObservableImpl;
import system.design.designPattern.OberverDesignPattern.Observable.StockObservable;
import system.design.designPattern.OberverDesignPattern.Observer.EmailAlertObserverImpl;
import system.design.designPattern.OberverDesignPattern.Observer.MobileAlertObserverImpl;
import system.design.designPattern.OberverDesignPattern.Observer.NotificationAlertObserver;

public class Client {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abhi@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("barkade@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abhibarkade111", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(90);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
