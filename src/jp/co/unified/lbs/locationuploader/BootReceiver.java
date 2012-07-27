package jp.co.unified.lbs.locationuploader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Boot Receiver Class
 *
 * @author kaz
 */
public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(this.getClass().getSimpleName(), "Boot event received.");
        
        // 位置情報サービスの起動
        context.startService(new Intent(context, LocationService.class));
    }
}
