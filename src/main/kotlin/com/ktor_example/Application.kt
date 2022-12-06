package com.ktor_example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.ktor_example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureTemplating()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
