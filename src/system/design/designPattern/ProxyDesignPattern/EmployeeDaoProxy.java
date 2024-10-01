package system.design.designPattern.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImp emp;
    EmployeeDaoProxy(){
        emp = new EmployeeDaoImp();
    }
    @Override
    public void create(String client, EmployeeDo employeeDo) throws Exception {
        if(client.equals("ADMIN")){
            emp.create(client,employeeDo);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")){
            emp.delete(client,0);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if (client.equals("AMDIN") || client.equals("USER")){
            return emp.get(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}
