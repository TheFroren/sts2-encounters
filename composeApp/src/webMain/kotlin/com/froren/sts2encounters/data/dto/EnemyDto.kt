package com.froren.sts2encounters.data.dto
import com.froren.sts2encounters.data.model.Enemy
import com.froren.sts2encounters.data.model.EnemyId
import com.froren.sts2encounters.data.model.HealthConstant
import com.froren.sts2encounters.data.model.HealthRange
import kotlinx.serialization.Serializable

@Serializable
data class EnemyDto(
    val id: String,
    val name: String,
    val hpMin: Int,
    val hpMax: Int,
    val hpMinAsc: Int,
    val hpMaxAsc: Int,
)
