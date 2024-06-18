/**
 * 
 * @author Rossy Mahlo

 * 
 */

package recycling.simulation.helper;

import java.util.Random;
//private data members
public class Recyclable {
    private String itemtype;
    private double pricePerKg;
    private double relativeWeight;
//constructor
    public Recyclable(String type, double pricePerKg) {
        this.itemtype = type;
        this.pricePerKg = pricePerKg;
        this.relativeWeight = 1;
    }
//overload contructor
    public Recyclable(String type, double pricePerKg, double relativeWeight) {
        this.itemtype = type;
        this.pricePerKg = pricePerKg;
        this.relativeWeight = relativeWeight;
    }

    public Recyclable(String text, int int1) {
		// TODO Auto-generated constructor stub
	}
	public double generateWeight() {
        Random r = new Random();
        double randomVal = 0.5 + r.nextDouble();
        return randomVal*relativeWeight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getType() {
        return itemtype;
    }
}