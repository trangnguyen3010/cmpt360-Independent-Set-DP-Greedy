# Hi Marker!
Thank you for marking my assignment!
I have created some scripts compile and run the Java files and tests for your convenience.
Please feel free to use it!
Thank you!

## Run the Program
```
./script.sh
```

[Enter the inputs]

e.g.
```
G4PCV44VFV:cmpt360-asn3-1 trang.nguyen$ ./script.sh
6
1
6
8
6
3
6
18
```

## Run the Tests Given by the Assignment
```script
./test.sh
```
(empty test result means there's no difference between actual output file and expected output file)

e.g.
```
G4PCV44VFV:cmpt360-asn3-1 trang.nguyen$ ./test.sh
Check test 1:
---------------------------------
Check test 2:
---------------------------------
Check test 3:
---------------------------------
Check test 4:
---------------------------------
Check test 5:
---------------------------------
Check test 6:
---------------------------------
Check test 7:
---------------------------------
Check test 8:
---------------------------------
Check test 9:
---------------------------------
Check test 10:
---------------------------------
Check test 11:
---------------------------------
Check test 12:
---------------------------------
Check test 13:
---------------------------------
Check test 14:
---------------------------------
Check test 15:
---------------------------------
Check test 16:
---------------------------------
Check test 17:
---------------------------------
Check test 18:
---------------------------------
Check test 19:
---------------------------------
```

## Run the Junit Tests
```script
./test_junit.sh
```

e.g.
```
G4PCV44VFV:cmpt360-asn3-1 trang.nguyen$ ./test_junit.sh
added manifest
adding: test/(in = 0) (out= 0)(stored 0%)
adding: test/result/(in = 0) (out= 0)(stored 0%)
adding: test/result/test6.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test7.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test5.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test4.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test1.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test3.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test2.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test15.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test14.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test16.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test17.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test13.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test12.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test10.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test11.out(in = 2) (out= 4)(deflated -100%)
adding: test/result/test19.out(in = 4) (out= 6)(deflated -50%)
adding: test/result/test18.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test9.out(in = 3) (out= 5)(deflated -66%)
adding: test/result/test8.out(in = 2) (out= 4)(deflated -100%)
adding: test/IndependentSetTest.class(in = 3755) (out= 1264)(deflated 66%)
adding: production/(in = 0) (out= 0)(stored 0%)
adding: production/cmpt360-asn3-1/(in = 0) (out= 0)(stored 0%)
adding: production/cmpt360-asn3-1/test/(in = 0) (out= 0)(stored 0%)
adding: production/cmpt360-asn3-1/test/IndependentSetTest.class(in = 4585) (out= 1484)(deflated 67%)
adding: production/cmpt360-asn3-1/main/(in = 0) (out= 0)(stored 0%)
adding: production/cmpt360-asn3-1/main/IndependentSet.class(in = 2154) (out= 1227)(deflated 43%)
adding: production/cmpt360-asn3-1/main/Path.class(in = 2171) (out= 1038)(deflated 52%)
adding: main/(in = 0) (out= 0)(stored 0%)
adding: main/IndependentSet.class(in = 1798) (out= 1079)(deflated 39%)
adding: main/Path.class(in = 2398) (out= 1081)(deflated 54%)
JUnit version 4.13.2
...................
Time: 0.039

OK (19 tests)
```

# Assignment Detail
## Written Question
[writtenQuestion.pdf](writtenQuestion.pdf)

Solution: [writtenSolution.pdf](writtenSolution.pdf)
## Programming Question
1. (20 pts) Implement, in Java, your algorithm to find a maximum independent
   set on a path. Your program should read input from System.in
   comprised of n + 1 lines; the first one is n, telling you how many more
   lines to read; and then the weights of each consecutive vertex are given,
   one per line. The example given would contain six lines:4
<br>6 &nbsp;&nbsp;&nbsp;&nbsp; # six weights
<br>1 &nbsp;&nbsp;&nbsp;&nbsp; # weight of v1
<br>6 &nbsp;&nbsp;&nbsp;&nbsp; # weight of v2
<br>8 &nbsp;&nbsp;&nbsp;&nbsp; # .
<br>6 &nbsp;&nbsp;&nbsp;&nbsp; # .
<br>3 &nbsp;&nbsp;&nbsp;&nbsp; # .
<br>6 &nbsp;&nbsp;&nbsp;&nbsp; # weight of v6
<br> and your output, sent to System.out should emit the total weight on
   one line:
   <br>18