#!/usr/bin/env bash

#echo Hello $1

USER_NAME=$1
echo Hello "$USER_NAME"

# shellcheck disable=SC2046
# shellcheck disable=SC2005

echo $(date)
# shellcheck disable=SC2046
# shellcheck disable=SC2005
echo $(pwd)

exit 0