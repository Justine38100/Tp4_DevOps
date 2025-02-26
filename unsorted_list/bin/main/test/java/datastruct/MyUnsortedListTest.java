package com.datastruct;

import org.junit.*;
import org.junit.rules.*;

import static org.junit.Assert.*;

import java.util.Random;

import javax.print.attribute.IntegerSyntax;


/**
 * Unit test for simple App.
 */
public class MyUnsortedListTest 
{




    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    //Initialisation
    @Test
    public void testCreation() { // a test case method
        MyUnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
        assertNotNull("Creation d'une list d'Integer",integers);
    }

    //@Test
    //public void testIntegrite(){
    //    MyUnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
    //    MyUnsortedList<Integer> clone_integers = MyUnsortedList.of(integers);
    //}



    //Test isEmpty()
    @Test
    public void testEmpty(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        assertTrue("La liste est vide", integers.isEmpty());
    }
    @Test
    public void testNotEmpty(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
        assertTrue("La liste est non vide", !integers.isEmpty());
    }


    //Test size()
    @Test
    public void testSize(){
        MyUnsortedList<Integer> integers0 = MyUnsortedList.of();
        MyUnsortedList<Integer> integers1 = MyUnsortedList.of(1);
        MyUnsortedList<Integer> integers2 = MyUnsortedList.of(1, 2);
        MyUnsortedList<Integer> integers3 = MyUnsortedList.of(1, 2, 3);
        MyUnsortedList<Integer> integers4 = MyUnsortedList.of(1, 2, 3, 4);

        assertEquals("Test taille de la liste",0 , integers0.size());
        assertEquals("Test taille de la liste",1 , integers1.size());
        assertEquals("Test taille de la liste",2 , integers2.size());
        assertEquals("Test taille de la liste", 3, integers3.size());
        assertEquals("Test taille de la liste", 4, integers4.size());
    }

    @Test
    public void testSizeRnd(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        assertTrue("Test liste vide", integers.isEmpty());
        Random rand = new Random();
        int randInt = rand.nextInt(20);
        for(int i = 0; i < randInt; i++){
            integers.append(0);
        }
        assertEquals("Test de la taille Random", randInt, integers.size());


    }

    //Test prepend()
    @Test
    public void testPrepend(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.prepend(0);
        assertEquals(MyUnsortedList.of(0), integers);
        integers.prepend(1);
        assertEquals(MyUnsortedList.of(1,0), integers);
    }
    @Test
    public void testPrependRdm(){
        Random rand = new Random();
        int randInt1, randInt2;
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        randInt1 = rand.nextInt(30);
        integers.prepend(randInt1);
        assertEquals(MyUnsortedList.of(randInt1), integers);
        randInt2 = rand.nextInt(30);
        integers.prepend(randInt2);
        assertEquals(MyUnsortedList.of(randInt2, randInt1), integers);        
    }    

    //Test append
    @Test
    public void testAppend(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.append(0);
        assertEquals(MyUnsortedList.of(0), integers);
        integers.append(1);
        assertEquals(MyUnsortedList.of(0,1), integers);
    }    
    @Test
    public void testAppenddRdm(){
        Random rand = new Random();
        int randInt1, randInt2;
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        randInt1 = rand.nextInt(30);
        integers.append(randInt1);
        assertEquals(MyUnsortedList.of(randInt1), integers);
        randInt2 = rand.nextInt(30);
        integers.append(randInt2);
        assertEquals(MyUnsortedList.of(randInt1, randInt2), integers);        
    }    

    //Test insert

    @Test
    public void testInsert(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(2);
        integers.insert(0, 0);
        assertEquals("Test insert",MyUnsortedList.of(0,2), integers);
        integers.insert(1, 1);
        assertEquals("Test insert",MyUnsortedList.of(0,1,2), integers);
        integers.insert(3, 3);
        assertEquals("Test insert",MyUnsortedList.of(0,1,2,3), integers);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertDownException(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.insert(1,-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertUpException(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.insert(1,1);
    }
    
    //Test pop
    @Test(expected = EmptyListException.class)
    public void testPopException(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.pop();
    }

    @Test
    public void testPopBasic(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        integers.append(1);
        int pop = integers.pop();
        assertEquals("Test pop taille", 0, integers.size());
        assertEquals("Test pop elem", 1,pop);        
    }
    @Test
    public void testPopAppend(){
        Random rand = new Random();
        int randInt = rand.nextInt(30), pop;
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        for(int i = 0; i <= randInt; i++){
            integers.append(i);
        }
        assertEquals("test taille de la liste", randInt+1, integers.size());
        pop = integers.pop();
        assertEquals("test taille de la liste",randInt, integers.size());
        assertEquals("test pop elem", 0,pop);
    }
    @Test
    public void testPopPrepend(){
        Random rand = new Random();
        int randInt = rand.nextInt(30), pop;
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        for(int i = 0; i <= randInt; i++){
            integers.prepend(i);
        }
        assertEquals("test taille de la liste", randInt+1, integers.size());
        pop = integers.pop();
        assertEquals("test taille de la liste",randInt, integers.size());
        assertEquals("test pop elem", randInt,pop);
    }

    //Test popLast()
    @Test
    public void testPopLast(){
        Random rand = new Random();
        int randInt,randSize;
        MyUnsortedList<Integer> integersPop = MyUnsortedList.of();
        MyUnsortedList<Integer> integersPopLast = MyUnsortedList.of();
        for(int i = 0; i <= rand.nextInt(30); i++){
            randInt = rand.nextInt(10);
            randSize = rand.nextInt(integersPop.size()+1);
            integersPop.insert(randInt,randSize);
            integersPopLast.insert(randInt,randSize);
        }
        assertEquals("Test deux liste egale", integersPop, integersPopLast);
        assertEquals("Test popLast", integersPop.remove(integersPop.size()-1), integersPopLast.popLast());
    }

    //Test remove()
    @Test
    public void testRemoveException(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        assertTrue(integers.isEmpty());
        assertThrows("Test liste vide remove", EmptyListException.class, ()->{integers.remove(-1);});
        assertThrows("Test liste vide remove", EmptyListException.class, ()->{integers.remove(1);});
        assertThrows("Test liste vide remove", EmptyListException.class, ()->{integers.remove(0);});
    }
    @Test
    public void testRemoveRand(){
        Random rand = new Random();
        MyUnsortedList<Integer> integers = MyUnsortedList.of();
        int randInt = rand.nextInt(30);
        for(int i = 0; i < randInt; i++){
            integers.insert(rand.nextInt(10),rand.nextInt(integers.size()+1));
        }
        assertEquals("Test taille liste", randInt,integers.size());
        int randInt2 = (randInt==0)?0:rand.nextInt(randInt);
        for(int i = 0; i < randInt2; i++){
            integers.remove(rand.nextInt(integers.size()));
        }
        assertEquals("Test taille liste", randInt-randInt2, integers.size());
    }
    @Test
    public void testRemove(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(0);
        int removed = integers.remove(0);
        assertEquals("Test remove", 0, removed);
        assertTrue("Test taille", integers.isEmpty());
    }

    //Test equals
    @Test
    public void testEqual(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(0,1,2,3);
        assertTrue("Test egalite", integers.equals(integers));
    }
    @Test
    public void testNotEqual(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(0,1,2,3);
        MyUnsortedList<Integer> integers2 = MyUnsortedList.of(0,1,2);
        MyUnsortedList<Integer> integers3 = MyUnsortedList.of(0,1,2,4);
        MyUnsortedList<Integer> integers4 = MyUnsortedList.of(0,1,2,3,4);
        assertFalse("Test egalite", integers.equals(integers2));
        assertFalse("Test egalite", integers.equals(integers3));
        assertFalse("Test egalite", integers.equals(integers4));

        assertFalse("Test egalite", integers.equals("hello"));
        
    }
    @Test
    public void testEqualString(){
        MyUnsortedList<Integer> integers = MyUnsortedList.of(0,1,2,3);
        MyUnsortedList<Integer> integers2 = MyUnsortedList.of(0,1,2,3);
        assertEquals("Test string egale", integers.toString(), integers2.toString());
    }
    
}

