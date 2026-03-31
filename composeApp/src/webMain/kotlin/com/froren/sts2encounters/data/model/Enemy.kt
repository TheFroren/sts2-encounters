package com.froren.sts2encounters.data.model

import androidx.compose.runtime.Immutable

value class EnemyId(val value: String)

@Immutable
data class Enemy(
    val id: EnemyId,
    val name: String,

    val healthRange: HealthRange,
)

@Immutable
data class HealthRange(
    val min: Int,
    val max: Int,
)
