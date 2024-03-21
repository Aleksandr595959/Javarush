package com.javarush.task.task24.task2409;

import java.util.List;

public abstract class AbstractJeans implements Jeans {
    List<Jeans> getAllJeans() {
        return null;
    }

    @Override
    public String toString() {
        return "AbstractJeans{}";
    }
}
