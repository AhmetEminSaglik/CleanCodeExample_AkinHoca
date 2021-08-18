package com.company.elevator;

public class ResponsibleElavator implements Elevator {
    private boolean doorOpen = false;
    private boolean stopped = true;
    private Floor currentFloor = Floor.ENTRANCE;
    private double weight = 0;

    private final double CAPACITY = 1000;


    @Override
    public void openDoor() {
        if (stopped)
            doorOpen = true;
        System.out.println("Door is open");
    }

    @Override
    public void closeDoor() {
        calculateCapacity();
        if (weight < CAPACITY) {
            doorOpen = false;
            stopped = false;
            System.out.println("Door is closed");

        } else {
            System.out.println("The elevator has exceeded capacity, doors will remain open until someone exits!");
            closeDoor();
        }
    }


    @Override
    public void go(Floor desiredFloor) {

        desiredFloor = Floor.refactorDesiredFloor(desiredFloor);

        int compare = currentFloor.compareTo(desiredFloor);
        while (compare != 0) {
            if (compare < 0) {
                goUp();
            } else {
                goDown();
            }
            compare = currentFloor.compareTo(desiredFloor);

        }
        openDoor();

    }


    void calculateCapacity() {
        weight = (int) (Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }

    void goUp() {
        prepareDoorToMove();
        if (currentFloor.compareTo(Floor.MAX) < 0) {
            System.out.println("Going  up!");
            currentFloor = currentFloor.increase();
            System.out.println("Current Floor " + currentFloor);
        } else
            System.out.println("Already on top floor.");
        stopped = true;

    }

    void goDown() {
        prepareDoorToMove();
        if (currentFloor.compareTo(Floor.MIN) > 0) {
            System.out.println("Going down!");
            currentFloor = currentFloor.decrease();
            System.out.println("Current Floor " + currentFloor);
        } else {
            System.out.println("Already on entrace floor." + currentFloor);
        }
    }

    void prepareDoorToMove() {
        if (doorOpen)
            closeDoor();

    }

}
