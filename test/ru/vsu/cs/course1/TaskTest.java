package ru.vsu.cs.course1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class TaskTest {
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(3, 5, 2, 4, 9, 1);
        int n = 2;
        List<Integer> expectedList = Arrays.asList(9, 1, 3, 5, 2, 4);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test2(){
        List<Integer> list = Arrays.asList(3, 5, 2, 4, 9, 1);
        int n = -15;
        List<Integer> expectedList = Arrays.asList(4, 9, 1, 3, 5, 2);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test3(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int n = -4;
        List<Integer> expectedList = Arrays.asList(4, 5, 6, 7, 8, 9, 0, 1, 2, 3);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = -3;
        List<Integer> expectedList = Arrays.asList(3, 4, 5, 0, 1, 2);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test5(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = -2;
        List<Integer> expectedList = Arrays.asList(2, 3, 4, 5, 0, 1);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test6(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = -1;
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 0);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test7(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = 0;
        List<Integer> expectedList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test8(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = 1;
        List<Integer> expectedList = Arrays.asList(5, 0, 1, 2, 3, 4);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test9(){
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        int n = 2;
        List<Integer> expectedList = Arrays.asList(4, 5, 0, 1, 2, 3);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
    @Test
    public void test10(){
        List<Integer> list = Arrays.asList(3, 5, 2, 4, 9, 1, 0, 0, 0, -3);
        int n = 3;
        List<Integer> expectedList = Arrays.asList(0, 0, -3, 3, 5, 2, 4, 9, 1, 0);
        Assertions.assertEquals(expectedList, Task.createNewList(list, n), "Array must be...");
    }
}