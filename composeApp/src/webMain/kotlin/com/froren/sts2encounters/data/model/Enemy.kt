package com.froren.sts2encounters.data.model

import androidx.compose.runtime.Immutable

value class EnemyId(val value: String)

@Immutable
data class Enemy(
    val id: EnemyId,
    val name: String,

    val health: HealthStat,
    val healthAscension: HealthStat,
)

sealed interface HealthStat

@Immutable
data class HealthRange(
    val min: Int,
    val max: Int,
): HealthStat

@Immutable
data class HealthConstant(
    val constant: Int,
): HealthStat
