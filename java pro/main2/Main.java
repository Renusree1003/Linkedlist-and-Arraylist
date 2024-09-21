package main2;
import java.io.*;
import java.lang.*;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args)throws IOException{
		//Your code here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.LinkedList\n2.ArrayList\nEnter your choice");
		int ch=Integer.parseInt(br.readLine());
		if(ch!=1 && ch!=2)
		{
            System.out.println("Invalid choice");
			System.exit(0);
		}
		System.out.println("Enter the number of elements to be added");
		int n=Integer.parseInt(br.readLine());
		switch(ch)
		{
            case 1:
				LinkedList LL=new LinkedList();
				LL.setSize(n);
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the element "+(i+1));
					LL.add(br.readLine());
				}
                LL.display();
		break;
			case 2:
				ArrayList AL = new ArrayList();
				AL.setSize(n);
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the element "+(i+1));
					AL.add(br.readLine());
				}
                AL.display();
				break;
		}
	}

}

    

