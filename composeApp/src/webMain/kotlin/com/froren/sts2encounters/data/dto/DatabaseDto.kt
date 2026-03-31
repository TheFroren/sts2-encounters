package com.froren.sts2encounters.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class DatabaseDto(
    val gameVersion: String,
    val enemies: List<EnemyDto>,
)
