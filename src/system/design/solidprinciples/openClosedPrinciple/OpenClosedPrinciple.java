package system.design.solidprinciples.openClosedPrinciple;

public class OpenClosedPrinciple {
    public static void main(String[] args) {

    }
}

class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice){
        // save to the database
    }
}

class FileInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
        // save to the file
    }
}