package hello

import arrow.effects.IO


fun main(args: Array<String>) {

    IO { println("Hello!") }.unsafeRunSync()

}