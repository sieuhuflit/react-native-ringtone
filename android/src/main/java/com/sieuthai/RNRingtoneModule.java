
package com.sieuthai;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.media.Ringtone;
import android.net.Uri;
import android.media.RingtoneManager;

public class RNRingtoneModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private Ringtone ringtone;

  public RNRingtoneModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRingtone";
  }

  @ReactMethod
  public void playRingtone() {
    Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
    ringtone = RingtoneManager.getRingtone(reactContext, notification);
    ringtone.play();
  }

  @ReactMethod
  public void stopRingtone() {
    if (ringtone != null && ringtone.isPlaying()) {
        ringtone.stop();
        ringtone = null;
    }
  }
}