package com.example.eatloop.domain.repository

import com.example.eatloop.domain.model.MenuItem

interface CartRepository {
    suspend fun addToCart(itemId: String, quantity: Int)

    suspend fun removeFromCart(itemId: String)

    suspend fun getCartItems(): List<MenuItem>

    suspend fun clearCart()

    suspend fun updateCartItemQuantity(itemId: String, quantity: Int)
}