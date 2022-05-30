package com.qsoft.repository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MainClass

fun main(args: Array<String>) {
    runApplication<MainClass>(*args)
}



