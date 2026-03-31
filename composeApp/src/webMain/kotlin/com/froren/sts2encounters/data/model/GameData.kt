package com.froren.sts2encounters.data.model

import androidx.compose.runtime.Immutable

@Immutable
data class GameData(
    val enemies: List<Enemy>,
) {
    companion object {
        val empty = GameData(
            enemies = emptyList()
        )
    }
}
