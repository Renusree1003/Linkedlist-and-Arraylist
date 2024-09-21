package main2;

public class Element {
    
    Object currentObject;
	Object nextObject;
	Element(Object co,Object no)
	{
		currentObject=co;
		nextObject=no;
	}
    void setNextObject(Object ob)
	{
		this.nextObject=ob;
	}
	Object getCurrentObject()
	{
		return currentObject;
	}
	
}


