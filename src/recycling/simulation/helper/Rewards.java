/**
 * 
 * @author Rossy Mahlo
 * 
 */

package recycling.simulation.helper;

public class Rewards {
	private int rands;
    private int cents;

    /* Default constructor for Money. */
    public Rewards() {
        rands = 0;
        cents = 0;
    }

    /* Constructor for Rewards, where rands and cents are given */
    public Rewards(int rands, int cents) {
        /* Converting cents to rands */
        rands += cents / 100;
        cents %= 100;
        this.rands = rands;
        this.cents = cents;
    }

    /* Sets rands of object */
    public void setRands(int rands) {
        this.rands = rands;
    }

    /* Sets cents of object */
    public void setCents(int cents) {
        /* Converting cents to rands if cents exceeds 100 cents */
        this.cents = cents;
        rands += this.cents / 100;
        this.cents %= 100;
    }

    /* Returns the amount of rands in object */
    public int getRands() {
        return rands;
    }

    /* Returns the amount of cents in object */
    public int getCents() {
        return cents;
    }

    /**
     *
     * @param rands the amount of rands to add to the Rewards object
     * @param cents the amount of cents to add to the Rewards object
     */
    public void addTo(int rands, int cents) {
        this.cents += cents;
        this.rands += this.cents / 100 + rands;
        this.cents %= 100;
    }

    /**
     *
     * @param Rewards object to be added with the called on object
     * @return a new Rewards object containing the sum of the called on object and the parameter object
     */
    public Rewards add(Rewards money) {
        return new Rewards(money.rands + rands, money.cents + cents);
    }

    /**
     *
     * @param Rewards object to be subtracted with the called on object
     * @return a new Rewards object containing the difference of the called on object and the parameter object
     */
    public Rewards subtract (Rewards money) {
    	int cents = this.getRands() * 100 + this.getCents();
    	int subCents = money.getRands() * 100 + money.getCents();
    	
    	return new Rewards(0, cents - subCents);
    }

    /* Returns a clone of the Rewards object. */
    public Rewards clone() {
        return new Rewards(this.getRands(), this.getCents());
    }

    /* Converts the Rewards object to a string, in order to print out */
    public String toString() {
        return "R" + rands + "." + String.format("%02d", cents);
    }

    /* Checks if there is sufficient funds for passed in amount of money. */
    public boolean sufficientFunds(Rewards amount) {
        if (this.getRands() > amount.getRands())
            return true;
        else if (this.getRands() == amount.getRands() && this.getCents() >= amount.getCents())
            return true;
        return false;
    }
    
    /* Converts to cents */
    public int toCents() {
    	return this.getRands() * 100 + this.getCents();
    }
}




