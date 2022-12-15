package com.github.chinloyal.pusher_client

import com.github.chinloyal.pusher_client.pusher.PusherService
import io.flutter.embedding.engine.plugins.FlutterPlugin

/** PusherClientPlugin */
class PusherClientPlugin : FlutterPlugin {

    override fun onAttachedToEngine(flutterPluginBinding: FlutterPlugin.FlutterPluginBinding) {
        PusherService().register(flutterPluginBinding.binaryMessenger)
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {
//    channel.setMethodCallHandler(null)
    }
}
