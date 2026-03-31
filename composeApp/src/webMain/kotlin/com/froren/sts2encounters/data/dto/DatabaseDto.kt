package com.froren.sts2encounters.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class DatabaseDto(
    val enemies: List<EnemyDto>,
)
