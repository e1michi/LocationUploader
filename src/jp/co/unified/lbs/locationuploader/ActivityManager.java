/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.unified.lbs.locationuploader;

import android.location.Location;
import android.util.Log;

/**
 * Activity Manager Class
 * 
 * @author kaz
 */
public class ActivityManager {

    public void upload(Location location) {
        Log.d(this.getClass().getSimpleName(), "Location uploaded: " + location.toString());
    }
}
