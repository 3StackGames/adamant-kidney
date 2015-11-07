# Phases and Actions

Below are a list of phases and corresponding actions that will be sent from the client to the backend. All actions will always also include the game code and player's display name.

## [Select Card Phase](docs/select-card-phase.md)

Each player selects which card they want to send to who.

```JSON
{
    "cardId": 1,
    "recipient": "DisplayName"
}
```

## [Move Card Phase](docs/move-card-phase.md)

Players receive their new cards.

## [Hookup Phase](docs/hookup-phase.md)

Players select if they want to hook-up, and with who, or if they want to ruin someone else's hook-up.

Option 1: Hook-Up

```JSON
{
    "partners" : [
      "Jason",
      "Arjun"
    ],
    "ruinPlayer" : null
}
```

Option 2: Ruin

```JSON
{
    "fuckPlayers" : null,
    "ruinPlayer" : "Jason"
}
```

## [RevealPhase](docs/reveal-phase.md)

Reveal who succeeded last night and who went home disappointed.

## [EndPhase](docs/end-phase.md)

The game has ended. Allow the first player to restart the game.

```JSON
{
    "restart": true
}
```
