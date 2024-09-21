package main2;
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unused")
public class LinkedList implements List{
	//Your code here
	Element[] object;
	String temp;
	int n,pos=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	LinkedList()
	{
		this.object=new Element[100];
	}
	void setSize(int k)
	{
		this.object=new Element[k];
	}
    public void add(Object obj)
	{
		if(pos==0)
		{
			object[pos++]=new Element(obj,"null");
		}
		else if(pos>0 && pos<object.length)
		{
			object[pos]=new Element(obj,"null");
			object[pos-1].setNextObject(object[pos].getCurrentObject());
			pos++;
		}
        else{
			return;
		}
		System.out.println("Added successfully");
	}
	public void display()
	{
		System.out.println("Linked List:");
		for(int i=0;i<pos;i++)
		{
            System.out.println("Current Element:"+object[i].currentObject);
			System.out.println("Next Element:"+object[i].nextObject);
		}
	}
}
