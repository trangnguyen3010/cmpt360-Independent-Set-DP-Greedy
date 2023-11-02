javac -d ./out/ ./src/main/*.java
jar -cvf ./lib/IndependentSet.jar -C ./out .
javac -cp :./lib/IndependentSet.jar:./lib/hamcrest-core-1.3.jar:./lib/junit-4.13.2.jar -d ./out ./src/test/IndependentSetTest.java
cd ./out
java -cp :../lib/IndependentSet.jar:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar org.junit.runner.JUnitCore test.IndependentSetTest
cd ..