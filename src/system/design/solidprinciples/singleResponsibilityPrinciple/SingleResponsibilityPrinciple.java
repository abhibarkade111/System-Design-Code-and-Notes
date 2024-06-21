package system.design.solidprinciples.singleResponsibilityPrinciple;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(new Marker(120, "Black"),23);
        System.out.println("Price= "+invoice.calculate());

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();
    }
}

class Invoice{
    Marker marker;
    int quantity;
    Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculate() {
        // logic of calculation should be here
        return quantity*marker.price;
    }
}

class InvoiceDao{
    Invoice invoice;
    InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // save into the DB
    }
}

class InvoicePrinter{
    Invoice invoice;
    InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        // Invoice printing logic
    }
}

class Marker{
    int price;
    String color;
    Marker(int price, String color){
        this.price = price;
        this.color = color;
    }
    // This class should be in separate file but for demonstration purpose written it here
//    Marker class properties exists here
}