package com.company.Elevator;

public enum Floor {
            MIN(-7), MINUS_7(-7),MINUS_6(-6),MINUS_5(-5),MINUS_4(-4), MINUS_3(-3), MINUS_2(-2), MINUS_1(-1), ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(5);
//    MIN(-4), MINUS_4(-4), MINUS_3(-3), MINUS_2(-2), MINUS_1(-1), ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(5);
//    MIN(-1), /*MINUS_4(-4), MINUS_3(-3), MINUS_2(-2),*/ MINUS_1(-1), ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(5);
//    MIN(0), /*MINUS_3(-3), MINUS_2(-2), MINUS_1(-1),*/  ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(5);
    //    MIN(1), /*MINUS_3(-3), MINUS_2(-2), MINUS_1(-1),  ENTRANCE(0),*/FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5), MAX(5);
    private int intFloor;

    Floor(int intFloor) {
        this.intFloor = intFloor;

    }

    int getIntFloor() {
        return intFloor;
    }

    int getNumberOfMinusFloors() {
        int i = 0;
        for (i = 0; i < Floor.values().length; i++) {
            if (Floor.values()[i].intFloor > -1) {//
                break;
            }
        }


        if (i > 0) {
            return i;
        } else {
            int enumMinIsAnUnSeenFloor = 1;
            return enumMinIsAnUnSeenFloor;
        }
    }

    Floor increase() {
        Floor upperFloor = this;
        upperFloor = Floor.values()[getPreValueToCalcuteDesiredFloorIndex() + 1];
       return upperFloor;
    }

    Floor decrease() {
        Floor lowerFloor = null;
        lowerFloor = Floor.values()[getPreValueToCalcuteDesiredFloorIndex() - 1];
        return lowerFloor;
    }

    int getPreValueToCalcuteDesiredFloorIndex() {

        if (MIN.getIntFloor() <= 0) {
            return getIntFloor() + getNumberOfMinusFloors();// +1 -> Minus icin
        }
        return getIntFloor();
    }

    static Floor refactorDesiredFloor(Floor desiredFloor) {
        if (desiredFloor == MIN)
            return MINUS_7;
        if (desiredFloor == MAX)
            return FIFTH;
        return desiredFloor;
    }


}
