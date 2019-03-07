package com.company;

public class Elevator {

    Integer currentFloor;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Elevator() {
        currentFloor = 0;
    }

    public void MoveTo(int floor){
        if(floor==currentFloor){
            System.out.println("Floor reached...!");
        }
        else{
            for(int i=currentFloor;i<=floor;i++){
                System.out.println("Floor>>"+i);
                currentFloor=i;
            }
            for(int i=currentFloor;i>=floor;i--){
                System.out.println("Floor>>"+i);
                currentFloor=i;
            }
        }
    }
}
