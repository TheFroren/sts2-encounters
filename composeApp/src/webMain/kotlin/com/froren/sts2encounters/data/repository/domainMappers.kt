package com.froren.sts2encounters.data.repository

import com.froren.sts2encounters.data.dto.DatabaseDto
import com.froren.sts2encounters.data.dto.EnemyDto
import com.froren.sts2encounters.data.model.Enemy
import com.froren.sts2encounters.data.model.EnemyId
import com.froren.sts2encounters.data.model.GameData
import com.froren.sts2encounters.data.model.HealthRange

fun DatabaseDto.toGameData(): GameData {
    val enemies = enemies.map(EnemyDto::toEnemy)

    return GameData(
        enemies = enemies,
    )
}

fun EnemyDto.toEnemy() = Enemy(
    id = EnemyId(id),
    name = name,
    healthRange = HealthRange(hpMin, hpMax),
)
