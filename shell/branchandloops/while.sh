#!/usr/bin/env bash

COUNT=0

while [ "$COUNT" -lt 10 ]; do
  echo "COUNT = $COUNT"
  ((COUNT++))
done

#infinit loop
#while [ "$COUNT" ]
#do
#  echo "COUNT = $COUNT"
#  ((COUNT++))
#done
#CTRL + C

echo "while loop finished."

exit 0