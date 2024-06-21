package system.design.solidprinciples.openClosedPrinciple;

public class Invoice {
    int quantity;
    int marker;
    Invoice(int quantity, int marker){
        this.quantity = quantity;
        this.marker = marker;
    }
}
