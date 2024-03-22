package com.demo.orderofservice.assets.enums;
public enum Status {
    
    OPEN(0, "Open"),
    PROGRESS(1, "In Progress"),
    CLOSE(2, "Closed");

    private int cod;
    private String description;

    private Status(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static Status toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Status x : Status.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Status Invalid: " + cod);
    }
}
