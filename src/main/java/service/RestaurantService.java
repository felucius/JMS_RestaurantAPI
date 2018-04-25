/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.RestaurantDAO;
import domain.Restaurant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.PersistenceException;

/**
 *
 * @author M
 */
@Stateless
public class RestaurantService {

    @Inject
    RestaurantDAO restaurantDAO;

    private static final Logger LOGGER = Logger.getLogger(RestaurantService.class.getName());

    public List<Restaurant> getRestaurant(String name) throws PersistenceException {
        try {
            return restaurantDAO.getRestaurant(name);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getRestaurant operation; {0}", pe.getMessage());
            return null;
        }
    }

    public List<Restaurant> getRestaurantRating(Integer rating) throws PersistenceException {
        try {
            return restaurantDAO.getRestaurantRating(rating);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getRestaurantRating operation; {0}", pe.getMessage());
            return null;
        }
    }

    public List<Restaurant> getCheckForFoodAllergies(Boolean foodallergies) throws PersistenceException {
        try {
            return restaurantDAO.getCheckForFoodAllergies(foodallergies);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getCheckForFoodAllergies operation; {0}", pe.getMessage());
            return null;
        }
    }

    public List<Restaurant> getRestaurants() throws PersistenceException {
        try {
            return restaurantDAO.getRestaurants();
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getRestaurants operation; {0}", pe.getMessage());
            return null;
        }
    }

    public Boolean insertRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.insertRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing insertRestaurant operation; {0}", pe.getMessage());
            return false;
        }
    }

    public Boolean updateRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.updateRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing updateRestaurant operation; {0}", pe.getMessage());
            return false;
        }
    }

    public Boolean removeRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.removeRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing removeRestaurant operation; {0}", pe.getMessage());
            return false;
        }
    }
}
