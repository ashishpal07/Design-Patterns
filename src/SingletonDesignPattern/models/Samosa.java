package SingletonDesignPattern.models;

// this is not the thread safe singleton object creation
public class Samosa {

    // created static variable so that we can use this variable in
    // static getInstance method()
    private static Samosa samosa;

    // mark constructor as private so that no one can get access to
    // create object direct

    // by using Reflection API anyone can change the constructor
    // access private to public and boom hum fas gaye singleton
    // break ho jayega
    // to prevent from reflection API we can put check inside constructor
    private Samosa(){
        if(samosa != null) {
            throw new RuntimeException("You are trying to break my singleton obj creation");
        }
    }

    // Lazy way of creating singleton object

    // create this method static because we need to create singleton obj
    // so need to call this method without creating class obj.

    /**
     * public static Samosa getInstance() {
     *         if(samosa == null) {
     *             samosa = new Samosa();
     *         }
     *         return samosa;
     *     }
     * **/


    // Just to make an thread safe singleton object creation we need to stop
    // if 2 threads runs at same time need to stop 1 thread so to make wait
    // anything we can think on synchronize we can use this to make sure only
    // one object gonna be create.
    public static Samosa getSingletonInstance() {
        if(samosa == null) {
            synchronized (Samosa.class) {
                if(samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
}
