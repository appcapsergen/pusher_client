package com.github.chinloyal.pusher_client.core.contracts

import io.flutter.plugin.common.BinaryMessenger

interface MChannel {
    fun register(messenger: BinaryMessenger)
}