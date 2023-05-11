package com.tenki.tenki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TenkiApplication

fun main(args: Array<String>) {
    runApplication<TenkiApplication>(*args)
}
