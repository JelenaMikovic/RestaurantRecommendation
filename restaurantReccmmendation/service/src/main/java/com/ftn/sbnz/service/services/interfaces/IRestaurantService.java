package com.ftn.sbnz.service.services.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ftn.sbnz.model.models.Restaurant;
import com.ftn.sbnz.service.dtos.ReccomendationsDTO;
import com.ftn.sbnz.service.dtos.RestaurantDTO;
import com.ftn.sbnz.service.dtos.RestaurantFilterDTO;


public interface IRestaurantService {

    List<Restaurant> getFilteredRestaurants(RestaurantFilterDTO filterDTO);

    List<Restaurant> searchRestaurantsByName(String name);

    Boolean addFavoriteRestaurant(Long restaurantId, Long userId);

    Boolean addRestaurant(RestaurantDTO restaurantDTO);
    ReccomendationsDTO getReccomendedRestaurants(Long userId);
}
