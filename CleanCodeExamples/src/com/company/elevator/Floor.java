package com.company.elevator;

public enum Floor {
    MIN(-1), ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(6);

    private int intFloor;

    Floor(int intFloor) {
        this.intFloor = intFloor;
    }

    int getIntFloor() {
        return intFloor;
    }

    Floor increase() {
        Floor upperFloor = null;
        if (this == MIN) {
            upperFloor = ENTRANCE;
        } else if (this == ENTRANCE) {
            upperFloor = FIRST;
        } else if (this == FIRST) {
            upperFloor = SECOND;
        } else if (this == SECOND) {
            upperFloor = THIRD;
        } else if (this == THIRD) {
            upperFloor = FOURTH;
        } else if (this == FOURTH) {
            upperFloor = FIFTH;
        } else upperFloor = MAX;
        return upperFloor;
    }

    Floor decrease() {
        Floor lowerFloor = null;
        if (this == MAX) {
            lowerFloor = FIFTH;
        } else if (this == FIFTH) {
            lowerFloor = FOURTH;
        } else if (this == FOURTH) {
            lowerFloor = THIRD;
        } else if (this == THIRD) {
            lowerFloor = SECOND;
        } else if (this == SECOND) {
            lowerFloor = FIRST;
        } else if (this == FIRST) {
            lowerFloor = ENTRANCE;
        } else lowerFloor = MIN;
        return lowerFloor;
    }
}
