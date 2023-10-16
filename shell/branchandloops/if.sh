#!/usr/bin/env bash

COLOR="$1"

if [ "$COLOR" = "blue" ]; then
  echo "The color is blue"
else
  echo "The color in NOT blue"
fi

# -eq equal ==
# -ne not equal !=
# -lt less than <
# -gt greater than >
# -le less than or equal <=
# -ge greater than or equal >=

USER_GUESS="$2"
COMPUTER=50

if [ "$USER_GUESS" -lt "$COMPUTER" ]; then
  echo "You're too low"
elif [ "$USER_GUESS" -gt "$COMPUTER" ]; then
  echo "You're too high"
else
  echo "You've guessed it"
fi

exit 0