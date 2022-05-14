package com.example.travelover.ViewModels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.travelover.Models.City

class FavouriteViewModel : ViewModel() {

    private val _favoriteCities = mutableStateListOf<City>() // mutableListOf<City>()
    val favoriteCities: List<City>
        get() = _favoriteCities


    fun addToFavorites(city: City) {
        if(!exists(city = city)){
            _favoriteCities.add(city)
        }
    }

    fun removeFromFavorites(city: City){
        _favoriteCities.remove(city)
    }

    private fun exists(city: City) : Boolean {
        return _favoriteCities.any {c -> c.id == city.id }
    }

    fun isFavorite(city: City) : Boolean {
        return exists(city)
    }
}