
package tasfia.awarenesscampaignmanager;


public class TrafficSignal {
    
    protected String location;
    protected String info;

    public TrafficSignal() {
    }

    public TrafficSignal(String location, String info) {
        this.location = location;
        this.info = info;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TrafficSignal{" + "location=" + location + ", info=" + info + '}';
    }
    
    
    
}
