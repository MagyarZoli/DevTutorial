#!/usr/bin/env bash

# shellcheck disable=SC2006
# shellcheck disable=SC2012
# shellcheck disable=SC2068

function GetFiles() {
    FILES=`ls -1 | sort | head -10`
}

function ShowFiles() {
    local COUNT=1
    for FILE in $@; do
      echo "FILE #$COUNT = $FILE"
      ((COUNT++))
    done
}

GetFiles
ShowFiles "$FILES"

exit 0