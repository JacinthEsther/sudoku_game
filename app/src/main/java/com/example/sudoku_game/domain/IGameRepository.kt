package com.example.sudoku_game.domain

interface IGameRepository {
    suspend fun saveGame(
        elapsedTime: Long,
        onSuccess:(Unit) -> Unit,
        onError: (Exception)-> Unit
    )


    suspend fun updateGame(
        game: SudokuPuzzle,
        onSuccess:(Unit) -> Unit,
        onError: (Exception)-> Unit
    )

    suspend fun updateNode(
        x: Int,
        y: Int,
        color: Int,
        elapsedTime: Long,
        onSuccess:(isComplete: Boolean) -> Unit,
        onError: (Exception) -> Unit
        )

    suspend fun getCurrentGame(
        onSuccess: (currentGame: SudokuPuzzle, isComplete: Boolean) -> Unit,
        onError: (Exception /* = java.lang.Exception */) -> Unit
    )

    suspend fun  getSettings(
        onSuccess: (Setting)-> Unit,
        onError: (Exception /* = java.lang.Exception */) -> Unit
    )

    suspend fun  updateSettings(
        settings: Setting,
        onSuccess: (Unit) -> Unit,
        onError: (Exception /* = java.lang.Exception */) -> Unit
    )
}