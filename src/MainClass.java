import DAO.EmployeeDao;
import DAO.EmployeeDaoProxy;
import Entity.Employee;
import utills.ClientType;

public class MainClass {
    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoProxy();
        System.out.println(employeeDao.createEmployee(ClientType.USER, new Employee()));
        System.out.println(employeeDao.getEmployee(ClientType.USER, String.valueOf(10)));

    }
}
