package com.chandrayan.Chandrrayan3_assement;
import  org.junit.Assert;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class ChandrayanTest 
{
    /**
     * Rirocketrous Test :-)
     * @throws Exception 
     */
	
    @Test
    public void shouldAnswerWithTrue() throws Exception 
    {
    	char[] commands = {'f','r','u','b','l'};
    	String Expected_Direction="N";
    	int Expected_X = 0;
    	int Expected_Y = 1;
    	int Expected_Z = -1;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    @Test
    public void testForForward() throws Exception 
    {
    	char[] commands = {'f'};
    	String Expected_Direction="N";
    	int Expected_X = 0;
    	int Expected_Y = 1;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    @Test
    public void testForBackward() throws Exception 
    {
    	char[] commands = {'b'};
    	String Expected_Direction="N";
    	int Expected_X = 0;
    	int Expected_Y = -1;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }  @Test
    public void testForUp() throws Exception 
    {
    	char[] commands = {'u'};
    	String Expected_Direction="Up";
    	int Expected_X = 0;
    	int Expected_Y = 0;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    @Test
    public void testForDown() throws Exception 
    {
    	char[] commands = {'d'};
    	String Expected_Direction="Down";
    	int Expected_X = 0;
    	int Expected_Y = 0;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    @Test
    public void testForLeft() throws Exception 
    {
    	char[] commands = {'l'};
    	String Expected_Direction="W";
    	int Expected_X = 0;
    	int Expected_Y = 0;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    
    @Test
    public void testForRight() throws Exception 
    {
    	char[] commands = {'r'};
    	String Expected_Direction="E";
    	int Expected_X = 0;
    	int Expected_Y = 0;
    	int Expected_Z = 0;
        Chandrayanmain rocket = new Chandrayanmain(0,0,0, "N", commands);
        rocket.Test();
        String Direction = rocket.getDirection();
        int x = rocket.getX();
        int y = rocket.getY();
        int z = rocket.getZ();
       Assert.assertEquals(Expected_Direction, Direction); 
        Assert.assertEquals(Expected_X, x);
        Assert.assertEquals(Expected_Y, y);
        Assert.assertEquals(Expected_Z, z);
    }
    @Test
    public void shouldAnswerWithTrue2() throws Exception
    {
    	char[] command = {'r','d','r'};
    	String True_Direction="N";
    	 Chandrayanmain rocket = new Chandrayanmain(0,0,0, "S", command);
         rocket.Test();
        String Direction = rocket.getDirection();
        Assert.assertEquals(True_Direction, Direction);
    }
}

