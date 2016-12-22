package com.example.c4q.exam12212016.model;

import java.util.List;

/**
 * Created by C4Q on 12/21/16.
 */

public class DataAnimals {
    private boolean success;
    private List<Animals> animals;

    public DataAnimals(boolean success, List<Animals> animals) {
        this.success = success;
        this.animals = animals;
    }

    public boolean isSuccess() {
        return success;
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }
}
