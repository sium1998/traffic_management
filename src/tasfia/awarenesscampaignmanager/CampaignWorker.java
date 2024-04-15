
package tasfia.awarenesscampaignmanager;


public class CampaignWorker {
    protected String name;
    protected String gender;
    protected String place;
    protected int campaign;
    protected int number;

    public CampaignWorker() {
    }

    public CampaignWorker(String name, String gender, String place, int campaign, int number) {
        this.name = name;
        this.gender = gender;
        this.place = place;
        this.campaign = campaign;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCampaign() {
        return campaign;
    }

    public void setCampaign(int campaign) {
        this.campaign = campaign;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CampaignWorker{" + "name=" + name + ", gender=" + gender + ", place=" + place + ", campaign=" + campaign + ", number=" + number + '}';
    }
    
    
    
    
}
