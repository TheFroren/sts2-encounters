package com.froren.sts2encounters.app

import androidx.compose.runtime.*
import com.froren.sts2encounters.data.repository.JsonGameDataRepository
import com.froren.sts2encounters.ui.state.GameDataState
import com.froren.sts2encounters.ui.screens.ErrorScreen
import com.froren.sts2encounters.ui.screens.HomeScreen
import com.froren.sts2encounters.ui.screens.LoadingScreen

@Composable
fun App() {
    val gameDataRepository = remember { JsonGameDataRepository() }
    var gameDataState by remember { mutableStateOf<GameDataState>(GameDataState.Loading) }

    LaunchedEffect(Unit) {
        gameDataState = gameDataRepository
            .loadData()
            .fold(
                onSuccess = { GameDataState.Ready },
                onFailure = { GameDataState.Error(it.message ?: "Unknown error") },
            )
    }

    when (val state = gameDataState) {
        GameDataState.Loading -> LoadingScreen()
        GameDataState.Ready -> HomeScreen(gameDataRepository)
        is GameDataState.Error -> ErrorScreen(state.message)
    }
}
