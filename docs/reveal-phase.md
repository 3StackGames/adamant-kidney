# Reveal Phase

Reveal who succeeded last night and who went home disappointed.

## Display

Show from worst to best how many points were scored and who scored them.

## Gamepad

```JSON
{
    "moveOn": true
}
```

## Backend

If someone won, move to `End Phase`. Otherwise, reset for another round and move to `Select Card Phase`.
