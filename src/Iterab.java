import java.util.Iterator;
import java.util.List;

public class Iterab<E> implements Iterator<E> {
  private int index;
  private List<E> lista;

  public Iterab(List<E> lista) {
    this.lista = lista;
    this.index = lista.size() - 1;
  }

  @Override
  public boolean hasNext() {
    return (index > -1);
  }

  @Override
  public E next() {
    if (hasNext()) {
      E elemento = lista.get(index);
      index -= 1;
      return elemento;
    } else {
      throw new NoSuchFieldError();
    }
  }
}
