package log;

import java.util.*;
public class Customlist<E> {
	    private int size = 0;
	    private static final int DEFAULT_CAPACITY = 10;
	    private Object elements[];
	    public Customlist() {
	        setElements(new Object[DEFAULT_CAPACITY]);
	        for(int i=0;i<10;i++)
	        {
	        	getElements()[size++] = i+1;
	        }
	    }
	    public void add(E e) {
	        if (size == getElements().length) {
	            ensureCapacity();
	        }
	        getElements()[size++] = e;
	    }
	    public E  fetch(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) getElements()[i];
	    }
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = getElements()[i];
	        int numElts = getElements().length - ( i + 1 ) ;
	        System.arraycopy( getElements(), i + 1, getElements(), i, numElts ) ;
	        size--;
	        return (E) item;
	    }
	    
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < size ;i++) {
	             sb.append(getElements()[i].toString());
	             if(i<size-1){
	                 sb.append(" ");
	             }
	         }
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = getElements().length * 2;
	        setElements(Arrays.copyOf(getElements(), newSize));
	    }
		public Object[] getElements() {
			return elements;
		}
		public void setElements(Object elements[]) {
			this.elements = elements;
		}
	

}