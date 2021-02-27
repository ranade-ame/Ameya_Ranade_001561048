/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author ameya
 */
public class Community extends City{
    
    public String communityName;
    
    public ArrayList<House> communityList = new ArrayList<House>();    

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<House> communityList) {
        this.communityList = communityList;
    }
    
    public House setPerHouse(String houseName){
        House houseget = null;
        for (House hse : communityList){
            if(hse.houseName.equalsIgnoreCase(houseName)){
                houseget = hse;
            }
        }
        if (houseget == null){
            houseget = new House();
            communityList.add(houseget);
        }
        return houseget;
    }
    
    public void printAbnormalCases(String communityName){
        Community comPrint = setHouseCommunity(communityName);
        ArrayList<House> comListPrint = comPrint.getCommunityList();
        int c = 1;
        int abnormalcases = 0;
        for(House hsePrint : comListPrint){
            ArrayList<Person> hseListPrint = hsePrint.getHouseList();
            for (Person perPrint : hseListPrint){
                boolean bldpresBool = perPrint.isThisVitalSignNormal("blood pressure", perPrint.getName());
                if (bldpresBool == false){
                    abnormalcases++;
                }
                c++;
            }    
        }
        System.out.println("Number of abnormal cases in " + comPrint.getCommunityName() + " = " + abnormalcases);
    }
    

    
}
