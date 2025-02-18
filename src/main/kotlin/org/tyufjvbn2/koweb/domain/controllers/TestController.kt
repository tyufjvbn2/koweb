package org.tyufjvbn2.koweb.domain.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {
    @GetMapping("default")
     fun getDefault(): String {
         return "I am default"
     }
}