/**
 * 
 * @author Rossy Mahlo
 * 
 */

package recycling.simulation.rmos;

import recycling.simulation.helper.Rewards;
import recycling.simulation.helper.Recyclable;
import recycling.simulation.rcm.RCM;

import java.util.ArrayList;

public class RMOS {
    private ArrayList<RCM> RCMList;
    private ArrayList<Recyclable> recyclableList;

    public RMOS() {
        RCMList = new ArrayList<RCM>();
        recyclableList = new ArrayList<Recyclable>();
    }

    public ArrayList<RCM> getRCMList() {
        return RCMList;
    }

    public void addRCM(RCM RCMMachine) {
        RCMList.add(RCMMachine);
        RCMList.get(RCMList.size() - 1).setRecyclableList(recyclableList);
    }

    public void addRecyclable(Recyclable recyclable) {
        for (Recyclable r: recyclableList)
            if (r.getType().equals(recyclable.getType()))
                return;
        recyclableList.add(recyclable);
        updateRCMRecyclables();
    }

    public void deleteRecyclable(String type) {
        for (int i = 0; i < recyclableList.size(); i++)
            if (recyclableList.get(i).getType().equals(type))
                recyclableList.remove(i);
        updateRCMRecyclables();
    }

    public void setRecyclablePrice(String type, double pricePerKg) {
        for (Recyclable recyclable : recyclableList)
            if (recyclable.getType().equals(type))
                recyclable.setPricePerKg(pricePerKg);
        updateRCMRecyclables();
    }

    private void updateRCMRecyclables() {
        for (RCM rcm: RCMList) {
        	rcm.setRecyclableList(recyclableList);
        }
    }
    
    private RCM getRCM(int id) throws Exception {
        for (RCM RCMMachine : RCMList)
            if (RCMMachine.getId() == id)
                return RCMMachine;
        throw new Exception("RCM not found.");
    }

    public String getRCMLocation(int id) throws Exception {
        return getRCM(id).getLocation();
    }

    public Rewards getRCMMoney(int id) throws Exception {
        return getRCM(id).getMoney();
    }

    public double getCapacity(int id) throws Exception {
        return getRCM(id).getCapacity();
    }

    public double getAvailableCapacity(int id) throws Exception {
        return getRCM(id).getAvailableCapacity();
    }

    public ArrayList<Recyclable> getRecyclableList() {
        return recyclableList;
    }
}
