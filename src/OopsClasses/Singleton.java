package OopsClasses;

public class Singleton {

    //It gets memory only once because of static, it contains the instance of the Singleton class.
    private static Singleton singleton;

    private Singleton(){
        System.out.println("Private constructor: It will prevent to instantiate the Singleton class from outside the class.");
    }

    /**
     * Static factory method: This provides the global point of
     * access to the Singleton object and returns the instance to the caller.
     * @return
     */
    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
