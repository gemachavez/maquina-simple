public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El total de dinero acumulado desde su inicio
    private int balanceTotal;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    // El total del dinero acumulado de la maquina desde su puesta en marcha

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "le�n";
        estacionDestino = "madrid";
    }
   
    public MaquinaExpendedoraSimple(int precioDelBillete, String destino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "le�n";
        estacionDestino = destino;
    }
    
    /**
     * Cambiar el precio del billete
     */
    public void cambiarPrecioBillete (int introducirNuevoPrecioBillete) {
        precioBillete = introducirNuevoPrecioBillete;
    }
    
    /**
     * reducir precio billete
     */
    public void reducirPrecioBillete(int reduccionDelPrecio) {
        precioBillete = precioBillete - reduccionDelPrecio;
    }
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }
    
    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }
    
    /**
     * Simula la introduccion de dinero
     */
    public int getTotalDineroAcumlado() {
        return totalDineroAcumulado;
    }
    
    /**
     * vacia el deposito de dinero
     */
    public void vaciarDepositoDinero() {
        totalDineroAcumulado = 0;
        balanceTotal = 0;
    }
   
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
