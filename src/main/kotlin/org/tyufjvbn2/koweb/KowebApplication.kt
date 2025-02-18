package org.tyufjvbn2.koweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KowebApplication

fun main(args: Array<String>) {
    runApplication<KowebApplication>(*args)
}
