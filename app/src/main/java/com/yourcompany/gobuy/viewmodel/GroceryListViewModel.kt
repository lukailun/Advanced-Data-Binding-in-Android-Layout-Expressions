package com.yourcompany.gobuy.viewmodel

import androidx.lifecycle.ViewModel
import com.yourcompany.gobuy.model.GroceryItem

class GroceryListViewModel : ViewModel() {
    var groceryListItems: ArrayList<GroceryItem> = ArrayList()

    fun getTotal(): Double = groceryListItems.sumOf { it.finalPrice }

    fun removeItem(position: Int) {
        groceryListItems.removeAt(position)
    }

    fun updateItem(position: Int, updatedItem: GroceryItem) {
        groceryListItems[position] = updatedItem
    }
}