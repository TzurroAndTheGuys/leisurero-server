package com.leisurero

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeisureroServerApplication

fun main(args: Array<String>) {
  runApplication<LeisureroServerApplication>(*args)
}
