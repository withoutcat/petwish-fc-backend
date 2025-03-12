package com.withoutcat.petwish

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PetwishApplication

fun main(args: Array<String>) {
    runApplication<PetwishApplication>(*args)
}