import java.util.Currency;
import java.util.Scanner;

class Monitor{
    private final String monitorSize, color, power;
    Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color; this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the monitor");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println("\tSize: " + monitorSize);
        System.out.println("\tColor: " + color);
        System.out.println("\tPower: " + power);
    }
}

class Computer{
    private final String cpu, memory, hd, color, power;
    Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu; this.memory = memory;
        this.hd = hd; this.color = color; this.power = power;
    }

    void turnOn(){
        System.out.println("Turning on the computer");
    }

    void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println("\tCpu: " + cpu);
        System.out.println("\tmemory: " + memory);
        System.out.println("\tHDD: " + hd);
        System.out.println("\tColor: " + color);
        System.out.println("\tPower: " + power);
    }
}

class PersonalComputer{
    Computer computer;
    Monitor monitor;
    void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }

    void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }

    PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
        turnOn(); printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        Monitor monitor = new Monitor("24 inch", "Black", "45W");
        PersonalComputer personalComputer = new PersonalComputer(computer, monitor);
    }
}
