import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.SimpleExplorer;

public class TestSimpleExplorer {
    @Test
    public void testAdd(){
        assertEquals(3, SimpleExplorer.add(1,2));
        assertEquals(9, SimpleExplorer.add(4,5));
        assertEquals(5, SimpleExplorer.add(7,-2));
        //assertEquals(3, SimpleExplorer.add(0,2));
        assertEquals(10, SimpleExplorer.add(8,2));
        assertEquals(-7, SimpleExplorer.add(-6,-1));
        assertEquals(4, SimpleExplorer.add(2,2));
        assertEquals(14, SimpleExplorer.add(2,12));
        assertEquals(11, SimpleExplorer.add(34,-23));
        assertEquals(7, SimpleExplorer.add(1,6));
    }

    @Test
    public void testMinus(){
        assertEquals(1, SimpleExplorer.minus(2,1));
        assertEquals(3, SimpleExplorer.minus(2,-1));
        assertEquals(0, SimpleExplorer.minus(0,0));
        assertEquals(112, SimpleExplorer.minus(222,110));
        assertEquals(20, SimpleExplorer.minus(1,-19));
        assertEquals(4, SimpleExplorer.minus(5,1));
        assertEquals(34, SimpleExplorer.minus(28,-6));
        assertEquals(-25, SimpleExplorer.minus(2,27));
        assertEquals(2, SimpleExplorer.minus(2,0));
        assertEquals(7, SimpleExplorer.minus(8,1));

    }

    @Test
    public void tesMul(){
        assertEquals(1, SimpleExplorer.mul(1,1));
        assertEquals(3, SimpleExplorer.mul(-3,-1));
        assertEquals(3, SimpleExplorer.mul(0,0));
        assertEquals(112, SimpleExplorer.mul(28,4));
        assertEquals(20, SimpleExplorer.mul(4,5));
        assertEquals(4, SimpleExplorer.mul(2,2));
        assertEquals(34, SimpleExplorer.mul(2,17));
        assertEquals(-25, SimpleExplorer.mul(5,-5));
        assertEquals(2, SimpleExplorer.mul(2,1));
        assertEquals(7, SimpleExplorer.mul(7,1));
    }

    @Test
    public void testDiv(){

    }
    @Test
    public void testPower(){

    }

    @Test
    public void testMod(){

    }

    @Test
    public void testSqrt(){

    }

    @Test
    public void testFac(){

    }

    @Test
    public void testPrime(){

    }

    @Test
    public void testNumOfCharacters(){

    }


}
