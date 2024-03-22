package com.demo.orderofservice.assets.enums;

public enum Priority {
    
    LOW(0, "Low"),
    MEDIUM(1, "Medium"),
    HIGH(2, "High");

    private int cod;
    private String description;

    private Priority(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static Priority toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Priority x : Priority.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Priority Invalid: " + cod);
    }

}
