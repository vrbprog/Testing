import org.junit.Assert;
import org.junit.Test;

public class ComingAfterFourTest {

    @Test
    public void afterFour1() {
        Assert.assertArrayEquals(new int[]{},ComingAfterFour.afterFour(new int[]{1,4,6,9,4}));
    }

    @Test
    public void afterFour2() {
        Assert.assertArrayEquals(new int[]{7,9,3},ComingAfterFour.afterFour(new int[]{4,7,9,3}));
    }

    @Test(expected = RuntimeException.class)
    public void afterFour3() {
        ComingAfterFour.afterFour(new int[]{});
    }

    @Test(expected = RuntimeException.class)
    public void afterFour4() {
        ComingAfterFour.afterFour(new int[]{3,5,8,1});
    }

    @Test
    public void afterFour5() {
        Assert.assertArrayEquals(new int[]{1},ComingAfterFour.afterFour(new int[]{4,7,9,3,4,1}));
    }

    @Test
    public void arrayHaveOnlyOneAndFour1() {
        Assert.assertTrue(ComingAfterFour
                .arrayHaveOnlyOneAndFour(new int[]{1,4,4,4}));
    }

    @Test
    public void arrayHaveOnlyOneAndFour2() {
        Assert.assertFalse(ComingAfterFour
                .arrayHaveOnlyOneAndFour(new int[]{1,4,5,4}));
    }

    @Test
    public void arrayHaveOnlyOneAndFour3() {
        Assert.assertFalse(ComingAfterFour
                .arrayHaveOnlyOneAndFour(new int[]{4,4,4,4}));
    }

    @Test
    public void arrayHaveOnlyOneAndFour4() {
        Assert.assertFalse(ComingAfterFour
                .arrayHaveOnlyOneAndFour(new int[]{1,1}));
    }
}