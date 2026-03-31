package com.froren.sts2encounters.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.froren.sts2encounters.data.model.Enemy

@Composable
fun EnemyCard(enemy: Enemy) {
    Column {
        Text(enemy.name)
        Text("HP range: ${enemy.healthRange.min} - ${enemy.healthRange.max}")
    }
}
