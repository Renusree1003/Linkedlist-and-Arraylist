package main2;

public class ArrayList implements List{
	//Your code here
	Object[] object;
	Object temp;
	int n,i,pos=0;
	ArrayList()
	{
		object=new Object[100];
	}
	void setSize(int k)
	{
		object = new Object[k];
	}
    public void add(Object obj)
	{
		object[pos++]=obj;
		System.out.println("Added successfully");
	}
	public void display()
	{
		System.out.println("Array List:");
		for(int i=0;i<pos && object[i]!=null;i++)
		{
			System.out.println(object[i]);
		}
	}
}
