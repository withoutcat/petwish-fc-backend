package com.withoutcat.petwish.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthzController {

    @GetMapping("/")
    fun defaultDomainResponse(): ResponseEntity<Void> {
        return ResponseEntity.status(HttpStatus.FOUND)
            .header("Location", "/welcome.html")
            .build()
    }
}