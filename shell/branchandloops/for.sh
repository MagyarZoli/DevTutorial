#!/usr/bin/env bash

# shellcheck disable=SC2124

NAMES=$@

for NAME in $NAMES; do
  if [ "$NAME" = "Tracy" ]; then
    #break
    continue
  fi
  echo "Hello $NAME"
done

echo "for loop terminated"

exit 0