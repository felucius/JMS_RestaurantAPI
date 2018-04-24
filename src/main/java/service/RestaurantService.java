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

    public Restaurant getRestaurant(String name) throws PersistenceException {
        try {
            return restaurantDAO.getRestaurant(name);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getVehicle operation; {0}", pe.getMessage());
            return null;
        }
    }

    public List<Restaurant> getRestaurants() throws PersistenceException {
        try {
            return restaurantDAO.getRestaurants();
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getVehicle operation; {0}", pe.getMessage());
            return null;
        }
    }

    public Boolean insertRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.insertRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getVehicle operation; {0}", pe.getMessage());
            return false;
        }
    }

    public Boolean updateRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.updateRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getVehicle operation; {0}", pe.getMessage());
            return false;
        }
    }

    public Boolean removeRestaurant(Restaurant restaurant) throws PersistenceException {
        try {
            return restaurantDAO.removeRestaurant(restaurant);
        } catch (PersistenceException pe) {
            LOGGER.log(Level.FINE, "ERROR while performing getVehicle operation; {0}", pe.getMessage());
            return false;
        }
    }
}
