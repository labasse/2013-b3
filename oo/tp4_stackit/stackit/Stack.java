package stackit;

import java.util.Enumeration;
import java.util.EmptyStackException;

public class Stack
{
	private Object data[];
	private int top=-1;	

	public Stack(int size)
	{
		this.data=new Object[size];
	}
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	public Object pop()
	{
		if(this.isEmpty())
			throw new EmptyStackException();
		return this.data[this.top--];
	}
	public void push(Object value)
	{
		if(this.top+1==this.data.length)
			throw new OutOfMemoryError();
		this.data[++this.top]=value;
	}
	public Enumeration<Object> getEnumeration()
	{
		return new StackEnumeration();
	}
	private class StackEnumeration implements Enumeration<Object>
	{
		private int counter=top;

		public boolean hasMoreElements()
		{
			return counter>=0;
		}
		public Object nextElement()
		{
			return data[this.counter--];
		}
	}
	public static void main(String [] args)
	{
		Stack s=new Stack(128);

		for(int i=0; i<16; i++)
			s.push(new Integer(i));

		for(Enumeration<Object> it=s.getEnumeration(); it.hasMoreElements(); )
			System.out.println(it.nextElement());
	}
}
