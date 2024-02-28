import java.util.List;

public class main {
	public static void main(String args[]) {
		Conjunto c = new Conjunto<>();
		c.agregar('d');
		c.agregar("j");
		c.agregar(1);
		c.agregar(-1);
		c.agregar(2.0);
		c.agregar("sdsffd");
		//c.imprimir();
		
		Conjunto d= new Conjunto<>();
		d.agregar('g');
		d.agregar("jtertgrtgert");
		d.agregar(1000);
		d.agregar(-10000);
		d.agregar(26868.0);
		d.agregar("hola");
		//d.imprimir();
		
		
		
		//System.out.println(c.eliminar(-1));
		//System.out.println("hola mundo "+c.obtener(2.0));
		//System.out.println(c.verificar(c, 2));
		
		
		Conjunto a = c.unir(d);
		a.imprimir();
		
	}
}
