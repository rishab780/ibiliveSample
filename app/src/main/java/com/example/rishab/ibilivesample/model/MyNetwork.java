package com.example.rishab.ibilivesample.model;

/**
 * Created by Rishab on 01-05-2017.
 */

public class MyNetwork {
    private String name;

    /**
     * @param name name of user
     */
    public MyNetwork(final String name) {
        this.name = name;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name name
     */

    public void setName(final String name) {
        this.name = name;
    }
}
