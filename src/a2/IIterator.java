//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\ 
// Joe Martinez
// Fall 2015 CSC 133
// Assignment 2 of the Dog Catcher Game
// 
// This is the iterator interface for game objects.
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\ 

package a2;

public interface IIterator{
	public boolean hasNext();
	public Object getNext();
	public void remove();
	
	public int getIndex();
	public Object objectAt(int i);
}
