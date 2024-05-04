package org.launchcode.techjobs.oo;

import java.util.Objects;

/**
 * Created by Trevor Gruber
 */
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    
    @Override
    public String toString() {
        return getValue();
    }
    
    // Getters and Setters:
    
    public int getId() {
        return id;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    
}
