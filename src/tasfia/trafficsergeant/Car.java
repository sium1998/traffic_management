
package tasfia.trafficsergeant;


public class Car {
    protected int number;
    protected int speed;
    protected int date;
    protected String location;

    public Car() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Car(int number, int speed, int date, String location) {
        this.number = number;
        this.speed = speed;
        this.date = date;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car{" + "number=" + number + ", speed=" + speed + ", date=" + date + ", location=" + location + '}';
    }
    
    
    
}
