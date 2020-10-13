package com.ngmatt.weedmapsandroidcodechallenge.ui.shoppinglist

import com.ngmatt.weedmapsandroidcodechallenge.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}