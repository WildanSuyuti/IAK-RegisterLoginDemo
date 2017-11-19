package id.co.kakaroto.iakregisterlogindemo.base;

import android.app.Application;

import id.co.kakaroto.iakregisterlogindemo.utility.DatabaseHandler;
import id.co.kakaroto.iakregisterlogindemo.utility.SessionManager;

/**
 * Created by kakaroto on 19/11/17.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SessionManager.init(this);
        DatabaseHandler.init(this);
    }
}
