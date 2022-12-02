package DAO;

import Entity.Employee;
import utills.ClientType;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    @Override
    public String createEmployee(ClientType client, Employee employee) {
        if(client == ClientType.USER)
            throw new RuntimeException("ACCESS DENIED");
        return employeeDao.createEmployee(employee);
    }

    @Override
    public String getEmployee(ClientType client, String id) {
        if(client == ClientType.USER || client == ClientType.ADMIN)
        return employeeDao.getEmployee(id);
        else
            throw new RuntimeException("ACCESS DENIED");
    }
}
