package test;

import main.IndependentSet;
import main.Path;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.CombinableMatcher.either;

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

    @Test
    public void findIndependentSetMaxWeightPath_givenOneElement_returnTheOnlyElementValue() {
        Path path = new Path(1);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("1 = 1", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenTwo_FirstBigger_returnFirstValue() {
        Path path = new Path(2, 1);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("2 . = 2", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenTwo_SecondBigger_returnSecondValue() {
        Path path = new Path(3, 7);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals(". 7 = 7", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenTwoEqual() {
        Path path = new Path(7, 7);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        assertThat(result, either(is(". 7 = 7")).or(is("7 . = 7")));
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenThree_MiddleBiggerThanSumFirstThird() {
        Path path = new Path(3, 7, 2);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals(". 7 . = 7", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenThree_MiddleLessThanSumFirstThird() {
        Path path = new Path(3, 1, 2);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("3 . 2 = 5", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenThreeEqual() {
        Path path = new Path(3, 3, 3);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("3 . 3 = 6", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenFour_BiggestSumFirstFourth() {
        Path path = new Path(7, 1, 2, 7);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("7 . . 7 = 14", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenFour_BiggestSumSecondFourth() {
        Path path = new Path(9, 7, 2, 7);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("9 . . 7 = 16", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath5() {
        Path path = new  Path(7, 4, 5, 1, 6);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("7 . 5 . 6 = 18", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath6() {
        Path path = new Path(6, 3, 2, 8, 9, 5);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("6 . . 8 . 5 = 19", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath7() {
        Path path = new Path(2, 9, 7, 3, 6, 4, 5);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        assertThat(result, either(is(". 9 . . 6 . 5 = 20")).or(is("2 . 7 . 6 . 5 = 20")));

    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath13() {
        Path path = new Path(8, 2, 7, 6, 3, 4, 10, 1, 11, 13, 12, 9, 5);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("8 . 7 . 3 . 10 . 11 . 12 . 5 = 56", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath14() {
        Path path = new Path(2, 7, 9, 3, 6, 10, 8, 5, 4, 11, 12, 13, 1, 14);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("2 . 9 . . 10 . 5 . 11 . 13 . 14 = 64", result);
    }

    @Test
    public void findIndependentSetMaxWeightPath_givenPath18() {
        Path path = new Path(4, 12, 14, 3, 7, 1, 16, 2, 13, 5, 10, 6, 11, 8, 9, 15, 17, 18);
        String result = IndependentSet.findIndependentSetMaxWeightPath(path);
        Assert.assertEquals("4 . 14 . 7 . 16 . 13 . 10 . 11 . . 15 . 18 = 108", result);
    }

}