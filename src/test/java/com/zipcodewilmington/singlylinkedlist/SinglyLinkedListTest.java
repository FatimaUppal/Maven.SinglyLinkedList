package com.zipcodewilmington.singlylinkedlist;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<String>list;

    @Before
    public void before(){
        list = new SinglyLinkedList<String>();
    }


    @Test
    public void testAdd(){
        String expected="test";

        list.add(expected);

        Assert.assertTrue(list.contains(expected));
    }
    @Test
    public void testRemove(){
        String expected="test";
        list.add("test");

        list.remove("test");

        Assert.assertFalse(list.contains(expected));
    }
    @Test
    public void testContains(){
        String expected="test";

        list.add(expected);

        Assert.assertTrue(list.contains(expected));
    }
    @Test
    public void testFind1(){
        int expected =1;
        String val= "target";
        list.add("");
        list.add(val);

        int actual = list.find(val);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFind2() {
        int expected =-1;
        String val= "target";
        list.add("");
        list.add("");

        int actual = list.find(val);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSize(){
        int expected =1;
        list.add("");


        int actual=list.size();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGet(){
        String expected= "target";
        list.add("target");

        String actual = list.get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCopy(){
        list.add("first");


        SinglyLinkedList<String> actual= list.copy();

        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals(list.get(i), actual.get(i));
        }
    }

    @Test
    public void testSort(){
        String expected= "test";
        list.add("yo");
        list.add("test");
        list.add("yaur");

        list.sort();

        String actual= list.get(0);

       Assert.assertEquals(expected, actual);


    }

}
