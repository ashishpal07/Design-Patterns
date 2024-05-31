package AbstractFactoryDesignPattern.models;

import FactoryDesignPattern.models.Employee;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 80000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer");
        return "WEB DEVELOPER";
    }
}
