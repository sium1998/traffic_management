
package tasfia.trafficsergeant;


public class TrafficPolice {
    protected String name,location;

    public TrafficPolice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "TrafficPolice{" + "name=" + name + ", location=" + location + '}';
    }
    
    
    
}
