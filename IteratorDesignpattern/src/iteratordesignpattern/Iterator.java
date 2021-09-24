package iteratordesignpattern;

public interface Iterator<T> {
	void reset();   
    T next();   
 
    T currentItem();    
 
    boolean hasNext();
}
