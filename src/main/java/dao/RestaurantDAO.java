/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Restaurant;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author M
 */
public interface RestaurantDAO {

    Restaurant getRestaurant(String name) throws PersistenceException;

    List<Restaurant> getRestaurants() throws PersistenceException;

    Boolean insertRestaurant(Restaurant restaurant) throws PersistenceException;

    Boolean updateRestaurant(Restaurant restaurant) throws PersistenceException;

    Boolean removeRestaurant(Restaurant restaurant) throws PersistenceException;
}
