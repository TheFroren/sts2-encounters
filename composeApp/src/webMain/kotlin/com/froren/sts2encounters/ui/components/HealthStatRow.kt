package com.froren.sts2encounters.ui.components

import androidx.compose.runtime.Composable
import com.froren.sts2encounters.data.model.HealthConstant
import com.froren.sts2encounters.data.model.HealthRange
import com.froren.sts2encounters.data.model.HealthStat

@Composable
fun HealthStatRow(name: String, hp: HealthStat) {
    val formatted = when (hp) {
        is HealthConstant -> "${hp.constant}"
        is HealthRange -> "${hp.min} - ${hp.max}"
    }

    StatRow(name, formatted)
}