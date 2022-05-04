import org.junit.Test;
import static org.junit.Assert.*;

public class StructureTest {
    @Test
    public void StructureFirst()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(11);
        newStructure.pushLast(31);
        assertTrue(newStructure.peekFirst().equals("11"));
    }
    
    @Test
    public void StructureFirst2()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(3);
        assertTrue(newStructure.peekFirst().equals("3"));
    }
    
    @Test
    public void StructureFirst3()
    {
        Structure newStructure = new Structure();
        newStructure.pushLast(31);
        assertTrue(newStructure.peekFirst().equals("31));
    }
                                            
    @Test
    public void StructureFirst4()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(20);
        newStructure.pushFirst(30);
        newStructure.pushLast(40);
        assertTrue(newStructure.peekFirst().equals("30"));
    }
                                            
    @Test
    public void StructureFirst5()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(20);
        newStructure.popFirst();
        assertTrue(newStructure.peekFirst().equals("20"));
    }
                                            
    @Test
    public void StructureLast()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(20);
        assertTrue(newStructure.peekLast().equals("20"));
    }

    @Test
    public void StructureLast2()
    {
        Structure newStructure = new Structure();
        newStructure.pushLast(47);
        assertTrue(newStructure.peekLast().equals("47"));
    }

    @Test
    public void StructureLast3()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(96);
        assertTrue(newStructure.peekLast().equals("96"));
    }

    @Test
    public void StructureLast4()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(20);
        newStructure.pushFirst(30);
        newStructure.pushLast(40);
        assertTrue(newStructure.peekLast().equals("40"));
    }

    @Test
    public void StructureLast5()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(20);
        newStructure.popLast();
        assertTrue(newStructure.peekFirst().equals("10"));
    }
                                           
    @Test
    public void StructureLengthTest()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushFirst(20);
        newStructure.pushFirst(30);
        assertTrue(newStructure.length() == 3);
    }

    @Test
    public void StructureLengthTest2()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(10);
        newStructure.pushLast(40);
        newStructure.pushFirst(20);
        newStructure.pushLast(30);
        assertTrue(newStructure.length() == 4);
    }

    @Test
    public void StructureLengthTest3()
    {
        Structure newStructure = new Structure();
        newStructure.pushLast(10);
        newStructure.pushLast(20);
        newStructure.pushLast(30);
        newStructure.pushLast(40);
        newStructure.pushLast(50);
        assertTrue(newStructure.length() == 5);
    }

    @Test
    public void StructureLengthTest4()
    {
        Structure newStructure = new Structure();
        newStructure.pushLast(10);
        newStructure.pushLast(20);
        newStructure.pushLast(30);
        newStructure.pushLast(40);
        newStructure.pushLast(50);
        newStructure.popLast();
        newStructure.popLast();
        assertTrue(newStructure.length() == 3);
    }

    @Test
    public void StructureLengthTest5()
    {
        Structure newStructure = new Structure();
        newStructure.pushFirst(5);
        newStructure.popFirst();
        assertTrue(newStructure.length() == 0);
    }

    @Test
    public void StructureLengthTest6()
    {
        Structure newStructure = new Structure();
        newStructure.pushLast(55);
        newStructure.popLast();
        assertTrue(newStructure.length() == 0);
    }       
}
