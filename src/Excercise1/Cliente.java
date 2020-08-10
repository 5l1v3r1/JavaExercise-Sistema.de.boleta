package Excercise1;
public class Cliente {
    
    String cliente, destino;
    int cantidad;

    public Cliente(String cliente, String destino, int cantidad) {
        this.cliente = cliente;
        this.destino = destino;
        this.cantidad = cantidad;
    }
    

    
    public double porcentual_pasaje(){
        if (destino.equalsIgnoreCase("París")) {
            if (cantidad < 5){
                return (precio_destino()*10)/100;
            }
            return (precio_destino()*15)/100;
        }
        if (destino.equalsIgnoreCase("Italia")) {
            if (cantidad < 5){
                return (precio_destino()*15)/100;
            }
            return (precio_destino()*20)/100;
        }
        if (destino.equalsIgnoreCase("Grecia")) {
            if (cantidad < 5){
                return (precio_destino()*20)/100;
            }
            return (precio_destino()*25)/100;
        }
        return 0;
    }
    public double precio_destino(){
        if (destino.equalsIgnoreCase("París")) {
            return  184.00;
        }
        if (destino.equalsIgnoreCase("Italia")) {
            return  184.70;
        }
        if (destino.equalsIgnoreCase("Grecia")) {
            return  127.40;
        }
        return 0;
    }
    public double total(){
        return precio_destino()*cantidad;
    
    }
    public double total_descuento(){
            return total() - porcentual_pasaje();
    }
    
    
    
    
}
