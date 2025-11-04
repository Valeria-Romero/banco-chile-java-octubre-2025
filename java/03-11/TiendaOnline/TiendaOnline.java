package TiendaOnline;

public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";

        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalon = 29.99; //Producto nuevo
        double precioZapatos = 59.99; //Producto nuevo

        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex"; //Usuario nuevo
        String cliente3 = "Miguel"; //Usuario nuevo

        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true; //Ana
        boolean pedidoConfirmadoCliente2 = false; //Alex
        boolean pedidoConfirmadoCliente3 = true; //Miguel

        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        // ** Aquí irán las declaraciones de impresión relacionadas con la interacción
        // del cliente ** //

        //Esto lo hicimos en la ayudantia
        // Ana ha pedido un pantalón. Imprime el mensaje del estado de su pedido haciendo uso de una sentencia if.

        if(pedidoConfirmadoCliente1){
            System.out.println(cliente1 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + precioPantalon);
        }

        System.out.println("---------------- Pedido de Miguel -------------------");
        System.out.println(mensajeBienvenida + cliente3);
        double totalMiguel = precioZapatos + precioLibro;
        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3 + mensajeConfirmacion);
            System.out.println(mensajeMostrarTotal + totalMiguel);
        }
    }
}
