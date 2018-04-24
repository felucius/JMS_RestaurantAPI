/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.RestaurantDAO;
import domain.Restaurant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Singleton;
import javax.inject.Inject;

/**
 *
 * @author M
 */
@Startup
@Singleton
public class Init {

    @Inject
    RestaurantDAO restaurantDAO;

    private List<Restaurant> restaurants = null;

    @PostConstruct
    public void init() {
        restaurants = new ArrayList();
        createRestaurants();
    }

    public void createRestaurants() {
        restaurants.add(new Restaurant("Eindhoven", "Italian"));
        restaurants.add(new Restaurant("Geldrop", "Sushi"));
        restaurants.add(new Restaurant("Eindhoven", "Wok"));
        restaurants.add(new Restaurant("Geldrop", "All you can eat"));
        restaurants.add(new Restaurant("Veldhoven", "Bulgarian"));

        for (Restaurant restaurant : restaurants) {
            restaurantDAO.insertRestaurant(restaurant);
        }
    }
}
