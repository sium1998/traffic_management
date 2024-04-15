
package tasfia.awarenesscampaignmanager;


public class Pedestrian {
    protected int age;
    protected String location;

    public Pedestrian() {
    }

    public Pedestrian(int age, String location) {
        this.age = age;
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Pedestrian{" + "age=" + age + ", location=" + location + '}';
    }
    
    
    
}
