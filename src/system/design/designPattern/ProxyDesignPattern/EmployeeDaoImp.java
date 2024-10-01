package system.design.designPattern.ProxyDesignPattern;

public class EmployeeDaoImp implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo employeeDo) {
        System.out.println("Employee created successfully");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Employee deleted successfully");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) {
        System.out.println("Employee fetched successfully");
        return new EmployeeDo();
    }
}
