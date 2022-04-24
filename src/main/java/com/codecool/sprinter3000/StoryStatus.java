package com.codecool.sprinter3000;

public enum StoryStatus {
    PLANNING("planning"), IN_PROGRESS("in progress"), DONE("done"), TESTING("testing");
    private final String status;

    StoryStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
