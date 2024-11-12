import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Проектная работа №1 Java-Module-Project-YP");
        Scanner scanner = new Scanner(System.in);
        Race race = new Race("",-1);
        for (int i=1; i<=3; i++){
            System.out.println("— Введите название машины №"+i+":");
            String carBrand = scanner.next();
            boolean speedLimit = true;
            int speed = -1;
            while (speedLimit){
                System.out.println("— Введите скорость машины №"+i+":");
                int curSpeed = scanner.nextInt();
                if (curSpeed < 0 || curSpeed > 250 ) {
                    System.out.println("— Неправильная скорость");
                } else {
                    speedLimit = false;
                }
                speed = curSpeed;
            }
            race.whoIsNewLeader(carBrand, speed);
        }
        race.sayLeaderName();
    }
}

class Car {
    String carBrand;
    int speed;

    Car (String carBrand, int speed){
        this.carBrand = carBrand;
        this.speed = speed;
    }
}

class Race {
    String leader = "";
    String carBrand;
    int speed;
    int distance = 0;

    public void whoIsNewLeader (String carBrand, int speed){
        int  raceTime = 24;
        int curDistance = raceTime * speed;
        if (curDistance > distance){
            leader = carBrand;
            distance = curDistance;
        }
    }

    public void sayLeaderName(){
        System.out.println("Самая быстрая машина: "+leader);
    }

    Race (String carBrand, int speed){
        this.carBrand = carBrand;
        this.speed = speed;
    }
}