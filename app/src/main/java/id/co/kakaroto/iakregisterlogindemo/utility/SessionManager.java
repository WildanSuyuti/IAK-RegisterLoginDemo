package id.co.kakaroto.iakregisterlogindemo.utility;

import android.content.Context;
import android.content.SharedPreferences;

import id.co.kakaroto.iakregisterlogindemo.model.Person;

/**
 * Created by alpin on 19/07/17.
 */

public class SessionManager {

    private static final String PREFERENCE_NAME = "preference";
    private static final String ISLOGGEDIN = "isloggedin";

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private static SessionManager instance;

    public SessionManager(Context context) {
        int PRIVATE_MODE = 0;
        preferences = context.getSharedPreferences(PREFERENCE_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public static void init(Context context) {
        instance = new SessionManager(context);
    }

    public synchronized static SessionManager getInstance() {
        return instance;
    }


    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(ISLOGGEDIN, isLoggedIn);
        editor.commit();
    }

    public boolean isLogin() {
        return preferences.getBoolean(ISLOGGEDIN, false);
    }


    public void clear() {
        editor.clear();
        editor.commit();
    }
}
