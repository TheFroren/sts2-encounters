package com.froren.sts2encounters.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.froren.sts2encounters.data.model.Enemy
import com.froren.sts2encounters.data.model.HealthConstant
import com.froren.sts2encounters.data.model.HealthRange

@Composable
fun EnemyCard(enemy: Enemy) {
    Column {
        Text(enemy.name)
        HealthStatRow("HP", enemy.health)
        HealthStatRow("HP (asc)", enemy.healthAscension)
    }
}
