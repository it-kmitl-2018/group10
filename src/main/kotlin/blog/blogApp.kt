package blog

import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

import java.util.*

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            var html = "<li><a href = 'hello'>hello</a></li>"
            html += "<li><a href = 'now'>now</a></li>"
            call.respondText(html, ContentType.Text.Html)
        }

        get("/hello") {
            call.respondText("Hello, Ktor !", ContentType.Text.Html)
        }

        get("/now") {
            call.respondText("Now time is : ${Date()}", ContentType.Text.Html)
        }
    }
}


fun main(args: Array<String>) {

    embeddedServer(Netty, 8080, watchPaths = listOf("blogApp.kt"),module = Application::module).start(wait = true)
}