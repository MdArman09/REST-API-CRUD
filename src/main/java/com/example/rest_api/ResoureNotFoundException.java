package com.example.rest_api;

public class ResoureNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private Object objetValue;

    public ResoureNotFoundException(String resourceName, String fieldName, Object objetValue) {
        super(String.format("%s Id doesn't exist %s: %s", resourceName, fieldName, objetValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.objetValue = objetValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getObjetValue() {
        return objetValue;
    }
}
