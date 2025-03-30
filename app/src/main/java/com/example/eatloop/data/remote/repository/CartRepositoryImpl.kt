package com.example.eatloop.data.remote.repository

import com.example.eatloop.domain.model.MenuItem
import com.example.eatloop.domain.repository.CartRepository

class CartRepositoryImpl: CartRepository {
    override suspend fun addToCart(itemId: String, quantity: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFromCart(itemId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getCartItems(): List<MenuItem> {
        TODO("Not yet implemented")
    }

    override suspend fun clearCart() {
        TODO("Not yet implemented")
    }

    override suspend fun updateCartItemQuantity(itemId: String, quantity: Int) {
        TODO("Not yet implemented")
    }
}