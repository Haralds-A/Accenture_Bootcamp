package day3.task5;

public class Tractor extends Car {
    int load_wight;

    public Tractor() {
        super();
        this.load_wight =0;
    }

    public void setLoad_wight(int load_wight) {
        if (load_wight<0){
            System.out.println("wight can not be negative");
        }
        this.load_wight = load_wight;
    }
}
