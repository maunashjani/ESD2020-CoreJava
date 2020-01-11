class Bicycle {
        
    int gear;
    int speed;
        
    public Bicycle(int sp, int g) {
        speed = sp;
        gear = g;
    }
        
    public void setGear(int g) {
        gear = g;
    }
        
    public void applyBrake() {
        speed = 0;
    }
        
    public void speedUp(int s) {
        speed += s;
    }

    public void display() {
        System.out.println("Gear: "+gear);
        System.out.println("Speed: "+speed);
    }
        
}

class MountainBike extends Bicycle {
        
    int seatHeight;

    public MountainBike(int h, int sp, int g) {
        super(sp, g);
        seatHeight = h;
    }   

    public void display()
    {
        super.display();
        System.out.println("Seat Height: "+seatHeight);
    }

    public void setHeight(int h) {
        seatHeight = h;
    }   

    public static void main(String [] args){
        /*System.out.println("Bicycle Object");
        Bicycle b = new Bicycle(20, 3);
        b.display();

        System.out.println("MountainBike Object");
        MountainBike mb = new MountainBike(18, 20, 3);
        mb.display();*/

        MountainBike mb = new MountainBike(18, 0, 1);
        mb.display();

        mb.speedUp(10);
        mb.display();

        mb.speedUp(5);
        mb.display();

        mb.setGear(2);
        mb.display();

        mb.applyBrake();
        mb.display();

        mb.setHeight(20);
        mb.display();

        mb.setGear(3);
        mb.display();

        mb.speedUp(20);
        mb.display();
    }

}