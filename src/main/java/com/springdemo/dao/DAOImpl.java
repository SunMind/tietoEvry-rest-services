package com.springdemo.dao;

import com.springdemo.entity.Choice;
import com.springdemo.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImpl implements DAO {

    //Other option add a connection to DB

    private Choice theChoice = new Choice();

    @Override
    public void saveChoice(Choice theChoices) {
      this.theChoice.setDistance(theChoices.getDistance());
      this.theChoice.setSeason(theChoices.getSeason());
      this.theChoice.setRelief(theChoices.getRelief());
    }

    @Override
    public Inventory getInventory() {

        System.out.println(theChoice);

        Inventory theInventory = new Inventory();

        if(theChoice.getDistance()>30608){
            theInventory.setExtraInfo("World record is 30608km. So i can only wish you luck");
            return theInventory;
        }

        if(theChoice.getDistance() >= 1 && theChoice.getDistance()<=20 ){
            theInventory.setDays("1");
            theInventory.setFood("Some snacks with high energy level");
            theInventory.setHygiene("Toilet paper-good to have");
        }
        else if(theChoice.getDistance() > 20 && theChoice.getDistance()<=100 ){
            theInventory.setDays("13 km/day average");
            theInventory.setFood("Prepare some meals for every day");
            theInventory.setHygiene("Toilet paper and some soap");
            theInventory.setTent("You must have one");
            theInventory.setSleepingBag("Also don't forget");
            theInventory.setMedicine("Some anti infection and pain killers");
        }
        else if(theChoice.getDistance() > 100 && theChoice.getDistance()<=30608 ){
            theInventory.setDays("13 km/day average. Plan your stops for refill your inventory");
            theInventory.setFood("Pick up some spices");
            theInventory.setHygiene("Toilet paper and some soap");
            theInventory.setTent("Take the best you can afford");
            theInventory.setSleepingBag("Your bed for a while - take the best");
            theInventory.setMedicine("Some anti infection and pain killers");
            theInventory.setSearchlight("Must have one");
            theInventory.setHuntingEquipment("Knife, fishing rod");
            theInventory.setTouristStove("Take one, for cooking");
        }
        if(theChoice.getRelief().equals("Mountains")){
            System.out.println("Now i am in Mountains");
            theInventory.setShoes("Mountain shoes");
            theInventory.setSocks("Wear two pairs at the same time");
        } else if(theChoice.getRelief().equals("Plains")){
            theInventory.setShoes("Plain shoes");
            theInventory.setSocks("Wear one pair");
        }
        if(theChoice.getSeason().equals("Winter") || theChoice.getSeason().equals("Autumn")){
            theInventory.setOutfit("Warm clothes");
            theInventory.setRainProtection("You better have one");
        }else if(theChoice.getSeason().equals("Summer") || theChoice.getSeason().equals("Spring")){
            theInventory.setOutfit("Light clothes");
        }

        System.out.println(theInventory);

        return theInventory;
    }
}
