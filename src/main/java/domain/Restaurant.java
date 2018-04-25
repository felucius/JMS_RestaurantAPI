/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.enterprise.inject.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author M
 */
@Model
@Entity
@NamedQueries({
    @NamedQuery(name = "Restaurant.getAllRestaurants",
            query = "SELECT r from Restaurant r")
    ,
    @NamedQuery(name = "Restaurant.getSpecificRestaurant",
            query = "SELECT r from Restaurant r "
            + "WHERE r.name = :name"),
    @NamedQuery(name = "Restaurant.getRestaurantRating",
            query = "SELECT r from Restaurant r "
                    + "WHERE r.rating = :rating"),
    @NamedQuery(name = "Restaurant.getCheckForFoodAllergies",
            query = "SELECT r from Restaurant r "
                    + "WHERE r.checkForFoodAllergies = :foodallergies")
})
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assigning primary key values to the Tweet table.
    Integer id = 0;
    String location = null;
    String name = null;
    Integer amountOfSeats = 0;
    Boolean checkForFoodAllergies = false;
    Integer rating = 0;

    public Restaurant() {

    }

    public Restaurant(String location, String name) {
        this.location = location;
        this.name = name;
        this.amountOfSeats = 25;
        this.checkForFoodAllergies = false;
        this.rating = 3;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public Integer getId(){
        return this.id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(Integer amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public Boolean getCheckForFoodAllergies() {
        return checkForFoodAllergies;
    }

    public void setCheckForFoodAllergies(Boolean checkForFoodAllergies) {
        this.checkForFoodAllergies = checkForFoodAllergies;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
