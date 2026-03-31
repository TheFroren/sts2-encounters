package com.froren.sts2encounters.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun StatRow(name: String, stat: String) {
    Row {
        Text(name)
        Text(stat)
    }
}