package me.pavelshvartsberg.chapter1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DuckTest() {
    @Test
    fun testMallardDuck() {
        val duck = Duck.mallardDuck("TEST_DUCK")
        assertEquals("TEST_DUCK flies with wings", duck.fly())
    }
}

