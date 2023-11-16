package test;

import main.IndependentSet;
import main.Path;
import org.junit.Assert;
import org.junit.Test;

public class IndependentSetTest {
    @Test
    public void findIndependentSetMaxWeight_givenOneElement_returnTheOnlyElementValue() {
        Path path = new Path(1);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenTwo_FirstBigger_returnFirstValue() {
        Path path = new Path(2, 1);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(2, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenTwo_SecondBigger_returnSecondValue() {
        Path path = new Path(3, 7);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(7, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenTwoEqual() {
        Path path = new Path(7, 7);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(7, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenThree_MiddleBiggerThanSumFirstThird() {
        Path path = new Path(3, 7, 2);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(7, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenThree_MiddleLessThanSumFirstThird() {
        Path path = new Path(3, 1, 2);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(5, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenThreeEqual() {
        Path path = new Path(3, 3, 3);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(6, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenFour_BiggestSumFirstThird() {
        Path path = new Path(7, 7, 2, 1);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(9, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenFour_BiggestSumFirstFourth() {
        Path path = new Path(7, 1, 2, 7);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(14, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenFour_BiggestSumSecondFourth() {
        Path path = new Path(9, 7, 2, 7);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(16, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenFourEqual() {
        Path path = new Path(3, 3, 3, 3);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(6, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath5() {
        Path path = new Path(7, 4, 5, 1, 6);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(18, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath6() {
        Path path = new Path(6, 3, 2, 8, 9, 5);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(19, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath7() {
        Path path = new Path(2, 9, 7, 3, 6, 4, 5);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(20, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath8_1(){
        Path path = new Path(4, 6, 4, 6, 4, 6, 4, 6);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(24, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath8_2(){
        Path path = new Path(4, 4, 4, 4, 6, 6, 6, 6);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(20, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath13() {
        Path path = new Path(8, 2, 7, 6, 3, 4, 10, 1, 11, 13, 12, 9, 5);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(56, result);
    }

    @Test
    public void findIndependentSetMaxWeight_givenPath14() {
        Path path = new Path(2, 7, 9, 3, 6, 10, 8, 5, 4, 11, 12, 13, 1, 14);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(64, result);
    }


    @Test
    public void findIndependentSetMaxWeight_givenPath18() {
        Path path = new Path(4, 12, 14, 3, 7, 1, 16, 2, 13, 5, 10, 6, 11, 8, 9, 15, 17, 18);
        int result = IndependentSet.findIndependentSetMaxWeight(path);
        Assert.assertEquals(108, result);
    }
}