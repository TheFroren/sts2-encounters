package com.froren.sts2encounters.data.repository

import com.froren.sts2encounters.data.model.GameData

interface GameDataRepository {
    fun getGameData(): GameData
}
