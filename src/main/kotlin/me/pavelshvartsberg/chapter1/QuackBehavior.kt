package me.pavelshvartsberg.chapter1

interface QuackBehavior {
    fun quack(duck: Duck): String
}

internal class Quack: QuackBehavior {
    override fun quack(duck: Duck) = "${duck.name} quacks"
}
internal class Squeak: QuackBehavior {
    override fun quack(duck: Duck) = "${duck.name} squeaks"
}
internal class MuteQuack: QuackBehavior {
    override fun quack(duck: Duck) = "${duck.name} mutes"
}