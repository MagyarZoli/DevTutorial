#!/usr/bin/env bash

# shellcheck disable=SC2006
# shellcheck disable=SC2012

FILES=`ls -1 | sort -r | head -3`
COUNT=1

for FILE in $FILES; do
  echo "File #$COUNT = $FILE"
  ((COUNT++))
done

exit 0