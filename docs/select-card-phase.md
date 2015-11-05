# Select Card Phase

Each player selects which card they want to send to who.

## Display

If 1st Time:
* Introduce Rules

If last phase was `Select Card Phase`
* Show who exchanged cards

## Gamepad

```JSON
{
    "cardId": 1,
    "recipient": "DisplayName"
}
```

## Backend

Move cards between players as necessary. After a random number of rounds, move to `Hookup Phase`.
