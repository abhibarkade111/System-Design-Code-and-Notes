package system.design.designPattern.OberverDesignPattern.Observer;

import system.design.designPattern.OberverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable){
        this.emailId = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"Woohooo... product is in stock hurry up");
    }

    public static void sendEmail(String emailId, String message){
        System.out.println("email sent to "+emailId);
    }
}
