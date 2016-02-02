package uk.co.djmckee.myapplication;

/**
 * Created by Dylan McKee on 02/02/16.
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    // This is the reference to the listener object...
    private MyInterface listenerObject;

    private MySingleton() {
    }

    // Getter and setters for the listener object reference...
    public MyInterface getListenerObject() {
        return listenerObject;
    }

    public void setListenerObject(MyInterface listenerObject) {
        this.listenerObject = listenerObject;
    }

    // A test method to call the listener object, just to show it works
    public void testListenerCall() {
        // Do a quick null check
        if (listenerObject != null) {
            // Listener object exists, go ahead, call myMethod (we KNOW it must exist on that object because it's in MyInterface)
            listenerObject.myMethod();

        }

    }

}
