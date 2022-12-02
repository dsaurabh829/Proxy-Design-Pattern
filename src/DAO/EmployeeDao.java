package DAO;

import Entity.Employee;
import utills.ClientType;

public interface EmployeeDao {

    public String createEmployee(ClientType client, Employee employee);
    public String getEmployee(ClientType client, String id);

}
