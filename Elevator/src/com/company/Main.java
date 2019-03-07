package com.company;

public class Main {

    public static void main(String args[]) {
        /*System.out.println("Elevator Program");
        Elevator elevator= new Elevator();
        elevator.MoveTo(7);
        elevator.MoveTo(3);
        elevator.MoveTo(5);*/

        AdminPanel panel = AdminPanel.getInstance();
        System.out.println(">>>>" + panel.getVersion());
    }
}