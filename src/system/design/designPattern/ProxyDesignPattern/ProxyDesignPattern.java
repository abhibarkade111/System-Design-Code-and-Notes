package system.design.designPattern.ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        EmployeeDao employeeDaoObj = new EmployeeDaoProxy();
        try {
            employeeDaoObj.create("ADMIN", new EmployeeDo());
            System.out.println("Operation successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
