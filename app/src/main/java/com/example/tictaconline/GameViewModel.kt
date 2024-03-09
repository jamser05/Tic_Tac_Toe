package com.example.tictaconline

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel: ViewModel() {
    private val _state = MutableStateFlow(GameState())
    val state = _state.asStateFlow()

}

class GameState