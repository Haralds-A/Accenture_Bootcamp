package day3.task5;

public class Car extends Vehicle{
    int gears;

    public Car() {
        super();
        this.gears = 0;
    }

    public void setGears(int gears) {
        if (gears<-1 || gears>6){
            System.out.println("not a gear");
        }else{
            this.gears = gears;
        }
    }
}
