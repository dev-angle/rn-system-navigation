package com.rnsystemnavigation

import android.view.Window
import androidx.core.view.WindowCompat
import android.view.View
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.WindowInsetsCompat
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.bridge.UiThreadUtil.runOnUiThread

@ReactModule(name = RnSystemNavigationModule.NAME)
class RnSystemNavigationModule(reactContext: ReactApplicationContext) :
  NativeRnSystemNavigationSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  @ReactMethod
  override fun hideSystemNavigation(): Boolean {
    try {
      runOnUiThread {
        val decorView = reactApplicationContext.currentActivity?.window?.decorView as View
        val window = reactApplicationContext.currentActivity?.window as Window
        val windowInsetController = WindowCompat.getInsetsController(window, decorView)
        windowInsetController.hide(WindowInsetsCompat.Type.navigationBars())
        windowInsetController.systemBarsBehavior =
        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
      }
      return true;
    } catch (e: IllegalViewOperationException) {
      return false
    }
  }

  @ReactMethod
  override fun showSystemNavigation(): Boolean {
    try {
      runOnUiThread {
        val decorView = reactApplicationContext.currentActivity?.window?.decorView as View
        val window = reactApplicationContext.currentActivity?.window as Window
        val windowInsetController = WindowCompat.getInsetsController(window, decorView)
        windowInsetController.show(WindowInsetsCompat.Type.navigationBars())
        windowInsetController.systemBarsBehavior =
        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
      }
      return true
    } catch (e: IllegalViewOperationException) {
        return false
    }
  }

  companion object {
    const val NAME = "RnSystemNavigation"
  }
}
