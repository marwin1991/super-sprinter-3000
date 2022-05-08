package com.codecool.sprinter3000;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
public enum StoryStatus {
    PLANNING("planning"), IN_PROGRESS("in progress"), DONE("done"), TESTING("testing");
    private final String status;

    @Override
    public String toString() {
        return status;
    }
}
