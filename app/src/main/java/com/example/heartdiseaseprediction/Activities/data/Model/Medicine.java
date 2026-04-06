package com.example.heartdiseaseprediction.Activities.data.Model;

public class Medicine {
    private String name;
    private String routine;
    private String amount;


    public Medicine(){}
    public Medicine(String name, String routine, String amount) {
        this.name = name;
        this.routine = routine;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoutine() {
        return routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
