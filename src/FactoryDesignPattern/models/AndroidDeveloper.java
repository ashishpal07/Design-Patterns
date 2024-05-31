package FactoryDesignPattern.models;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer Salary : ");
        return 5000;
    }
}
