package com.example.tictaconline

import kotlin.random.Random

data class GameModel(
    var gameId: String = "-1",
    var filledPosition: MutableList<String> = mutableListOf<String>(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ),
    var winner: String = "",
    var gameStatus: GameStatus = GameStatus.CREATED,
    var currentPlayer: String = (arrayOf("X", "0"))[Random.nextInt(2)]
)


enum class GameStatus {
    CREATED,
    JOINED,
    IN_PROGRESS,
    FINISHED
}