package com.froren.sts2encounters.data.repository

import com.froren.sts2encounters.data.dto.DatabaseDto
import com.froren.sts2encounters.data.model.GameData
import kotlinx.serialization.json.Json
import sts2_encounters.composeapp.generated.resources.Res

class JsonGameDataRepository(
    private val json: Json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }
) : GameDataRepository {

    private var cachedGameData: GameData = GameData.empty

    suspend fun loadData(): Result<GameData> {
        cachedGameData
            .takeUnless { it == GameData.empty }
            ?.let { return Result.success(cachedGameData) }

        val dto = loadDatabaseDto()
            .getOrElse { return Result.failure(it) }

        // TODO: Validation

        return Result.success(
            dto.toGameData().also { cachedGameData = it }
        )
    }

    private suspend fun loadDatabaseDto(): Result<DatabaseDto> {
        val bytes = Res.readBytes("files/data/database.json")
        val text = bytes.decodeToString()

        return runCatching {
            json.decodeFromString<DatabaseDto>(text)
        }.onFailure { e ->
            println("Failed to load database.json")
            e.printStackTrace()
        }
    }

    override fun getGameData(): GameData {
        return cachedGameData
    }
}
