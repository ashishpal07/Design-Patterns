package AbstractFactoryDesignPattern.models;

import FactoryDesignPattern.models.EmployeeFactory;

public class AFDC {

    Employee e1 =  EmployeeFactory.getEmployee(new AndroidDeveloperFactory());


}
