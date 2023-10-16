#!/usr/bin/env bash

# shellcheck disable=SC2046
# shellcheck disable=SC2005

NAME="$1"
FAVORITE_SPORT="$2"

echo "$NAME", like to watch "$FAVORITE_SPORT".
echo $(date)
echo $(pwd)

exit 0