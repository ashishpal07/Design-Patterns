package AbstractFactoryDesignPattern.models;

import FactoryDesignPattern.models.Employee;

// In FACTORY DESIGN PATTERN we used to give create object access to this class
// only, but now we have to add one more ABSTRACT layer to implement
// ABSTRACT FACTORY DESIGN PATTERN
public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
