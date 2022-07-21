package me.pavelshvartsberg.chapter1

import java.util.*

data class Duck(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val duckType: DuckType,
    private val flyBehavior: FlyBehavior,
    private val quackBehavior: QuackBehavior
) {

    fun fly() = flyBehavior.fly(this)

    fun quack() = quackBehavior.quack(this)

    companion object DuckFabrics {
        fun mallardDuck(name: String = "Default mallard duck name"): Duck = Duck(
            name = name,
            duckType = DuckType.MALLARD,
            flyBehavior = FlyWithWings(),
            quackBehavior = Quack()
        )
        fun redHeadDuck(name: String = "Default mallard duck name"): Duck = Duck(
            name = name,
            duckType = DuckType.RED_HEAD,
            flyBehavior = FlyWithWings(),
            quackBehavior = MuteQuack()
        )
        fun rubberDuck(name: String = "Default mallard duck name"): Duck = Duck(
            name = name,
            duckType = DuckType.RUBBER,
            flyBehavior = NoFly(),
            quackBehavior = Squeak()
        )
    }
}


enum class DuckType{
    MALLARD, RED_HEAD, RUBBER
}