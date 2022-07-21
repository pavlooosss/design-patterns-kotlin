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
    }
}


enum class DuckType{
    MALLARD, RED_HEAD, RUBBER
}