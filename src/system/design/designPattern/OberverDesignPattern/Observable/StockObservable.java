package system.design.designPattern.OberverDesignPattern.Observable;

import system.design.designPattern.OberverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
        void add(NotificationAlertObserver observer);
        void remove(NotificationAlertObserver observer);
        void notifySubscribers();
        void setStockCount(int stockCount);
        int getStockCount();
}
