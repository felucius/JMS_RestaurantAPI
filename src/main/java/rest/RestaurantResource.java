/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Restaurant;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import service.RestaurantService;

/**
 *
 * @author M
 */
@Stateless
@Path("restaurants")
@Produces(MediaType.APPLICATION_JSON)
public class RestaurantResource {

    @Inject
    RestaurantService restaurantService;

    @GET
    @Path("{name}")
    public Restaurant restaurant(@PathParam("name") String name) {
        return restaurantService.getRestaurant(name);
    }

    @GET
    public List<Restaurant> restaurants() {
        return restaurantService.getRestaurants();
    }
}
