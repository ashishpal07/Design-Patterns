package SingletonDesignPattern.models;

public class Client {

    // this is not the thread safe singleton object creation
    Samosa samosa = Samosa.getSingletonInstance();
}
