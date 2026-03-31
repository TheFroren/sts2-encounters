package com.froren.sts2encounters.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.froren.sts2encounters.data.repository.GameDataRepository
import com.froren.sts2encounters.ui.components.EnemyCard

@Composable
fun HomeScreen(gameDataRepository: GameDataRepository) {
    val enemies = gameDataRepository.getGameData().enemies

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            enemies.forEach {
                EnemyCard(it)
            }
        }
    }
}