
package tasfia.trafficsergeant;


public class Schedule {
    protected String name,location;
    protected int date;
    protected int time;
    protected String place,agenda;

    public Schedule() {
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return "Schedule{" + "name=" + name + ", location=" + location + ", date=" + date + ", time=" + time + ", place=" + place + ", agenda=" + agenda + '}';
    }
    
    
    
}
