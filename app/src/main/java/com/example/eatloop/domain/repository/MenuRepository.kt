package com.example.eatloop.domain.repository

import com.example.eatloop.domain.enums.MenuFilter
import com.example.eatloop.domain.model.MenuItem

interface MenuRepository {
    suspend fun getAllMenuItems(filter: MenuFilter): List<MenuItem>

    suspend fun searchForItem(query: String, filter: MenuFilter): List<MenuItem>

    suspend fun getItemDetails(itemId: String): MenuItem

    suspend fun getFavoriteItems(): List<MenuItem>

    suspend fun addToFavorites(itemId: String)

    suspend fun removeFromFavorites(itemId: String)

}