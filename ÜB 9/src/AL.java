import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AL<E> implements List<E> {
  protected E[] store = (E[]) new Object[5];
  protected int size = 0;

  public AL(E... es) {
    for (E e : es)
      add(e);
  }

  private void mkNewStore() {
    E[] newStore = (E[]) new Object[size + 5];
    for (int i = 0; i < store.length; i++)
      newStore[i] = store[i];
    store = newStore;
  }

  public void add(E e) {
    if (store.length <= size)
      mkNewStore();
    store[size++] = e;
  }

  public int size() {
    return size;
  }

  public E get(int i) {
    return store[i];
  }

@Override
public void addAll(List<E> cs) {
	for(int i = 0; i<cs.size(); i++) {
		this.add(cs.get(i));
	}
}

/*
@Override
public void remove(int i) {
if (i == size){
      size--;
    }
	if(this.get(i) != null) {
		this.remove(i);
		this.size--;
	};
}
*/

@Override
public void remove(int i) {
    if (i == size){
      size--;
    }
    if (i < size && i > -1){
      System.arraycopy(store, i + 1, store, i, size - 1 - i);
      store[size - 1] = null;
      size--;
    }
  }

@Override
public void insert(int i, E e) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean contains(E e) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsWith(Predicate<E> pred) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void reverse() {
	// TODO Auto-generated method stub
	
}

@Override
public void forEach(Consumer<? super E> consumer) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean startsWith(List<E> that) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean endsWith(List<E> that) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public List<E> sublist(int i, int l) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void sortBy(Comparator<? super E> cmp) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	
}
}
