package com.chandrayan.Chandrrayan3_assement;

import org.junit.Assert;
import org.junit.Test;

public class ChandrayanFalseTest {
	  @Test
	    public void shouldFalseDirection() throws Exception 
	    {
	    	char[] commands = {'f','r','u','b','l'};
	    	String Expected_Direction="S";
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
	    public void shouldFalseDirection2() throws Exception 
	    {
	    	char[] commands = {'f'};
	    	String Expected_Direction="S";
	    	int Expected_X = 0;
	    	int Expected_Y = 1;
	    	int Expected_Z = 0;
	    	//Direction given is N,expected is N because ,postion will changed not direction.
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
	    public void outOfRangeCheck() throws Exception 
	    {
	    	char[] commands = {'f'};
	    	String Expected_Direction="N";
	    	int Expected_X = 0;
	    	int Expected_Y = 1;
	    	int Expected_Z = 0;
	    	//Direction given is N,expected is N because ,postion will changed not direction.
	        Chandrayanmain rocket = new Chandrayanmain(2*100,0,0, "N", commands);
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
	  
}
