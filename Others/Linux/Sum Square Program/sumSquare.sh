#!/bin/bash
let "sum = 0"
for num in $*
  do
    let "sum = sum  + ($num*$num)"
  done
echo "$sum"