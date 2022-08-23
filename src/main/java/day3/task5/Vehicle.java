package day3.task5;

public class Vehicle {
    double speed;
    double driving_angle;

    public Vehicle(){
        this.speed = speed =0;
        this.driving_angle = driving_angle=0;
    }

    public void setSpeed(double speed) {
        this.speed += speed;
        if (this.speed<0){
            this.speed = 0;
        }
    }

    public void setDirection(double driving_angle) {
        if (driving_angle<-90 || driving_angle>90){
            System.out.println("imposible angle");
        }else{
            this.driving_angle = driving_angle;
        }
    }
}
