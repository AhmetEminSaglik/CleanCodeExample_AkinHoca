package com.company.elevator;

public class Main {

    public static void main(String[] args) {
        Elevator responsibleElevator = new ResponsibleElavator();

        responsibleElevator.go(Floor.MAX);
        responsibleElevator.go(Floor.MIN);

//        responsibleElevator.go(Floor.MAX);
//        responsibleElevator.go(Floor.MIN);
      /*  responsibleElevator.go(Floor.FIFTH);
        responsibleElevator.go(Floor.MAX);


        responsibleElevator.go(Floor.MIN);
        responsibleElevator.go(Floor.ENTRANCE);
        responsibleElevator.go(Floor.MIN);*/
    }
}
