package me.pavelshvartsberg.chapter1

interface QuackBehavior {
    fun quack(duck: Duck)
}

class Quack: QuackBehavior {
    override fun quack(duck: Duck) {
        println("${duck.name} quacks")
    }
}
class Squeak: QuackBehavior {
    override fun quack(duck: Duck) {
        println("${duck.name} squeaks")
    }
}
class MuteQuack: QuackBehavior {
    override fun quack(duck: Duck) {
        println("${duck.name} mutes")
    }
}