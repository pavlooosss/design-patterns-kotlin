package me.pavelshvartsberg.chapter1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DuckTest() {
    @Test
    fun testMallardDuck() {
        val duck = Duck.mallardDuck("TEST_DUCK")
        assertEquals("TEST_DUCK flies with wings", duck.fly())
        assertEquals("TEST_DUCK quacks", duck.quack())
    }

    @Test
    fun testRedHadDuck() {
        val duck = Duck.redHeadDuck("TEST_DUCK")
        assertEquals("TEST_DUCK flies with wings", duck.fly())
        assertEquals("TEST_DUCK mutes", duck.quack())
    }

    @Test
    fun testRubberDuck() {
        val duck = Duck.rubberDuck("TEST_DUCK")
        assertEquals("TEST_DUCK can not fly!", duck.fly())
        assertEquals("TEST_DUCK squeaks", duck.quack())
    }

}

