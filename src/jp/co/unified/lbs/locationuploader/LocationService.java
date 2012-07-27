package jp.co.unified.lbs.locationuploader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.IBinder;
import android.util.Log;

/**
 * Boot Receiver Class
 *
 * @author kaz
 */
public class LocationService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onCreate() {
        Log.d(this.getClass().getSimpleName(), "Location service starting....");

        // LocationManagerインスタンスの取得
        Context context = this.getApplicationContext();
        LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        // LocationReceiverの登録
        // プロトタイプは基地局ベース。商用はＧＰＳが必須。
        // 最小間隔：１０分
        // 最小移動距離：１０００メーター
        lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 600000, 1000, new LocationReceiver());

        Log.d(this.getClass().getSimpleName(), "Location service started.");
    }
}
