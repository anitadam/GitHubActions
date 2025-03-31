package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void addTest()
    {
        MyClass myClass = new MyClass();

        assertEquals(3, myClass.add(1,2));
        assertEquals(5,myClass.add(2,3));
        assertEquals(10,myClass.add(2,8));

    }
}
