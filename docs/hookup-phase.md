# Hookup Phase

Players select if they want to hook-up, and with who, or if they want to ruin someone else's hook-up.

## Display

If the last phase was `Select Card Phase`
* Show who passed cards to who


## Gamepad

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

## Backend

Tally up scores. If somebody won, move to `Reveal Phase`, otherwise move to `Select Card Phase`.
