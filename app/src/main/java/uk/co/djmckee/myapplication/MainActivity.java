package uk.co.djmckee.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

// Implement the listener interface...
public class MainActivity extends ActionBarActivity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // When the main activity appears, we'll set the Singleton's listener reference to this activity...
        MySingleton.getInstance().setListenerObject(this);


        // Let's get the Singleton to call the test method! You should see a log after this...
        MySingleton.getInstance().testListenerCall();

    }

    // onDestroy is called on view unload.
    protected void onDestroy() {
        super.onDestroy();

        // View unloading, remove reference in MySingleton by setting it to null
        // TODO: In production, ensure the listener object IS DEFINITELY 'this' before removing it, so as not to overwrite other activites loading actions.
        MySingleton.getInstance().setListenerObject(null);

    }

    // Here, I implement the MyInterface method...
    public void myMethod() {
        // Do stuff!!!!
        // Maybe get a new value from the singleton/update display here?
        Log.d("ListenerTest", "myMethod called!");

    }


}
