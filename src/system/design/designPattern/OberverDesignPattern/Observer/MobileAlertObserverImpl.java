package system.design.designPattern.OberverDesignPattern.Observer;

import system.design.designPattern.OberverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsg(username,"woohooo, product is in stock now hurry up");
    }

    public static void sendMsg(String username, String msg){
        System.out.println("Message sent to "+username);
    }
}
