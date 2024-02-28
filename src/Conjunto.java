
	import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
	import java.util.List;

	public class Conjunto <E> implements Iterable<E> {
	  private List<E> lista;

	  public Conjunto() {
	    lista = new ArrayList<E>();
	  }
	  public void imprimir() {
		  for (E e : lista) {
			System.out.println(e.toString());
		}
	  }
//agregar
	  public void agregar(E element) {
	    lista.add(element);
	  }
//iterador
	  @Override
	  public Iterator<E> iterator() {
	    return new Iterab<E>(lista);
	  }
	  
//eliminar
	  public boolean eliminar(E elemnento) {
			  return lista.remove(elemnento);
	  }
//buscar u obtener
	  private int obtenerIndice(E elemento) {
		  for (int i = 0; i<lista.size();i++) {
			  if (lista.get(i).equals(elemento)) {
				  return i;
			  }
		  }
		  return -1;
	  }
	  public E obtener(E elemento) {
		  int i = obtenerIndice(elemento);
		  return lista.get(i);
	  }
	  
//verificar si pertenece
	  public boolean verificar(Conjunto<E> conjunto,E element){

			return(lista.contains(element));}
	  
//unir dos conjuntos
	  

	  public Conjunto<E> unir( Conjunto lista2) {
	    List<E> union = new ArrayList<>();
	    union.addAll(lista);
	    union.addAll(lista2.getLista());
	    Conjunto<E> a = new Conjunto<>();
	    for (E e : union) {
			a.agregar(e);
		}
	    return a;
	  }
	public List<E> getLista() {
		return lista;
	}
	public void setLista(List<E> lista) {
		this.lista = lista;
	}


	  
	  
	  
	}



