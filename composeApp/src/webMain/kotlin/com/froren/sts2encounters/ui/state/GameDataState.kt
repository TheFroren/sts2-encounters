package com.froren.sts2encounters.ui.state

import com.froren.sts2encounters.data.model.GameData

sealed interface GameDataState {
        data object Loading : GameDataState
        data object Ready : GameDataState
        data class Error(val message: String) : GameDataState
}
