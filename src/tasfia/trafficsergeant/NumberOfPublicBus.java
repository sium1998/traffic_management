
package tasfia.trafficsergeant;


public class NumberOfPublicBus {
    protected int quantity;

    public NumberOfPublicBus() {
    }

    public NumberOfPublicBus(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "NumberOfPublicBus{" + "quantity=" + quantity + '}';
    }
    
    
    
}
