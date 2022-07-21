package me.pavelshvartsberg.chapter1

interface FlyBehavior {
    fun fly(duck: Duck): String
}

internal class FlyWithWings : FlyBehavior {
    override fun fly(duck: Duck): String {
        return "${duck.name} flies with wings"
    }
}

internal class NoFly : FlyBehavior {
    override fun fly(duck: Duck): String {
        return "${duck.name} can not fly!"
    }
}