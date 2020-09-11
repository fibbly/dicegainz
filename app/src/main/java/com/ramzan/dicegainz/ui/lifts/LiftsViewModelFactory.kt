package com.ramzan.dicegainz.ui.lifts

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ramzan.dicegainz.database.LiftDatabaseDao

class LiftsViewModelFactory(
    private val dataSource: LiftDatabaseDao,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LiftsViewModel::class.java)) {
            return LiftsViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
