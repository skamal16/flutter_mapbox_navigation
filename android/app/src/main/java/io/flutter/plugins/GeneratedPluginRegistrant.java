package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.dormmom.flutter_mapbox_navigation.FlutterMapboxNavigationPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterMapboxNavigationPlugin.registerWith(registry.registrarFor("com.dormmom.flutter_mapbox_navigation.FlutterMapboxNavigationPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
