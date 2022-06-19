package com.example.sudoku_game.domain

interface ISettingStorage {

    suspend fun getSettings(): SettingsStorageResult
    suspend fun updateSettings(setting: Setting): SettingsStorageResult
}

sealed class SettingsStorageResult{
    data class onSuccess(val currentGame: Setting) : SettingsStorageResult()
    data class onError(val exception: Exception) : SettingsStorageResult()
}