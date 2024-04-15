
package tasfia.awarenesscampaignmanager;

public class Campaign {
    protected String title;
    protected String purpose;
    protected String objective;
    protected int budget;
    protected int startdate;
    protected int enddate;

    public Campaign() {
    }

    public Campaign(String title, String purpose, String objective, int budget, int startdate, int enddate) {
        this.title = title;
        this.purpose = purpose;
        this.objective = objective;
        this.budget = budget;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getStartdate() {
        return startdate;
    }

    public void setStartdate(int startdate) {
        this.startdate = startdate;
    }

    public int getEnddate() {
        return enddate;
    }

    public void setEnddate(int enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Campaign{" + "title=" + title + ", purpose=" + purpose + ", objective=" + objective + ", budget=" + budget + ", startdate=" + startdate + ", enddate=" + enddate + '}';
    }
    
    
    
    
}
