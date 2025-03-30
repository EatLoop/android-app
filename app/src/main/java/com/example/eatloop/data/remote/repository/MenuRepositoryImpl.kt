package com.example.eatloop.data.remote.repository

import com.example.eatloop.domain.enums.MenuFilter
import com.example.eatloop.domain.model.MenuItem
import com.example.eatloop.domain.repository.MenuRepository

class MenuRepositoryImpl: MenuRepository {
    override suspend fun getAllMenuItems(filter: MenuFilter): List<MenuItem> {
        TODO("Not yet implemented")
    }

    override suspend fun searchForItem(query: String, filter: MenuFilter): List<MenuItem> {
        TODO("Not yet implemented")
    }

    override suspend fun getItemDetails(itemId: String): MenuItem {
        TODO("Not yet implemented")
    }

    override suspend fun getFavoriteItems(): List<MenuItem> {
        TODO("Not yet implemented")
    }

    override suspend fun addToFavorites(itemId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFromFavorites(itemId: String) {
        TODO("Not yet implemented")
    }
}