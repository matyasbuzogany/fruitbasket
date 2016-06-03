package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class FruitTest {

    @Test
    public void checkFruit(){
        final Fruit apple = new Fruit("apple", 1.5);
        Assert.assertEquals("checking fruit name", "apple", apple.getName());
        apple.setName("banana");
        apple.setPrice(3.14);
        Assert.assertEquals("checking fruit name", "banana", apple.getName());
        Assert.assertEquals("checking fruit price", 3.14,apple.getPrice(),.0);
    }

}
