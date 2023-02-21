import java.util.Scanner;

public class PruebaProducto {
        public static void main(String args[]) {
		// Declaración de variables para almacenar inputs del usuario
                String codigo, nombre, descripcion, categoria;
                double precio;

		// Definición de objeto Producto
                Producto producto1 = new Producto();

		// Mostrando valores por defecto
		producto1.mostrarValores();

		// Definición de objeto scanner;
                Scanner scanner = new Scanner(System.in);

		// Lectura de datos
                System.out.println("\nINGRESO DE NUEVO PRODUCTO");
                System.out.println("SOLICITUD DE DATOS \n");
                
                System.out.println("Código de producto:");
                codigo = scanner.nextLine();
                producto1.setCodigo(codigo);

                System.out.println("Nombre de producto:");
                nombre = scanner.nextLine();
                producto1.setNombre(nombre);

                System.out.println("Descripción de producto:");
                descripcion = scanner.nextLine();
                producto1.setDescripcion(descripcion);

                System.out.println("Categoría de producto:");
                categoria = scanner.nextLine();
                producto1.setCategoria(categoria);

                System.out.println("Precio de producto:");
                precio = scanner.nextDouble();
                producto1.setPrecio(precio);

                // Mostrando información del producto
                System.out.println("\n==================================");
                System.out.println("LOS DATOS DEL PRODUCTO AGREGADO SON");
                System.out.println("Código:\t\t" + producto1.getCodigo());
                System.out.println("Nombre:\t\t" + producto1.getNombre());
                System.out.println("Descripción:\t" + producto1.getDescripcion());
                System.out.println("Categoría:\t" + producto1.getCategoria());
                System.out.println("Precio:\t\t" + "$" +  producto1.getPrecio());
        }
}

