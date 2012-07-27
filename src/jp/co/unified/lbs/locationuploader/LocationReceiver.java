/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.unified.lbs.locationuploader;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author kaz
 */
public class LocationReceiver implements LocationListener {

    public void onLocationChanged(Location location) {
        Log.d(this.getClass().getSimpleName(), "Location changed: " + location.toString());

        ActivityManager am = new ActivityManager();
        am.upload(location);
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onProviderEnabled(String provider) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void onProviderDisabled(String provider) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
