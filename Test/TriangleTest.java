import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void test1()
    {
        final String type = Triangle.returnType(3, 3, 3);
        assertEquals("Equilateral", type);
    }

    @Test
    public void test2()
    {
        final String type = Triangle.returnType(1, 2, 4);
        assertTrue(type.equals("Not a triangle"));
    }

    @Test
    public void test3()
    {
        final String type = Triangle.returnType(1, 4, 2);
        assertFalse(type.equals("Isosceles"));
    }

    @Test
    public void test4()
    {
        final String type = Triangle.returnType(-1,0,-1);
        assertNotSame(type, "Not a triangle");

    }

    @Test
    public void test5()
    {
        final String type = Triangle.returnType(-1, 1, 1);
        assertNull(type);
    }
    @Test
    public void test6()
    {
        final String type = Triangle.returnType(-1, 1, 1);
        assertSame(type,"Isosceles");
    }




}