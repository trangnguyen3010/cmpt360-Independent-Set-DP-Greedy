#!/bin/bash

for i in {1..19}
do
  echo "Check test $i:"
  javac -d ./out/ ./src/main/*.java
  java -cp "./out/" "main.IndependentSet" < "./src/test/in/test$i.in" > "./out/test/result/test$i.out"
  diff "./src/test/out/test$i.out" "./out/test/result/test$i.out" | tr -d "\\" | tr -d " No newline at end of file"
  echo "---------------------------------"
done