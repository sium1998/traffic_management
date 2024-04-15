
package tasfia.trafficsergeant;


public class Speed {
    protected int limit;

    public Speed() {
    }

    public Speed(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Speed{" + "limit=" + limit + '}';
    }
    
    
    
}
