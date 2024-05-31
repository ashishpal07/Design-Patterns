package FactoryDesignPattern.models;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        return switch (empType) {
            case "ANDROID DEVELOPER" -> new AndroidDeveloper();
            case "WEB DEVELOPER" -> new WebDeveloper();
            default -> null;
        };
    }

}
