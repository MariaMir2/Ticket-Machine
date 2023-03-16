/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class PruebaMaquinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio pendiente de realizar");
        
        TicketMachine maquina1 = new TicketMachine(20);
        TicketMachine maquina2 = new TicketMachine(30);
        TicketMachine maquina3 = new TicketMachine(40);
        
        System.out.println("Maquina 1. Precio ticket = " + maquina1.getPrice());
        System.out.println("Maquina 2. Precio ticket = " + maquina2.getPrice());
        System.out.println("Maquina 3. Precio ticket = " + maquina3.getPrice());
        System.out.println();
        
        maquina1.insertMoney(10);
        System.out.println("Maquina 1. Insertamos " + maquina1.getCantidadIntroducida());
        maquina1.insertMoney(5);
        System.out.println("Maquina 1. Insertamos " + maquina1.getCantidadIntroducida());
        System.out.println("Maquina 1. Contiene monedas por valor de: " + maquina1.getBalance());
        System.out.println("Máquina 1. Solicitamos ticket.");
        maquina1.printTicket();
        
        maquina2.insertMoney(10);
        System.out.println("Maquina 2. Insertamos " + maquina2.getCantidadIntroducida());
        maquina2.insertMoney(30);
        System.out.println("Maquina 2. Insertamos " + maquina2.getCantidadIntroducida());
        System.out.println("Maquina 2. Contiene monedas por valor de: " + maquina2.getBalance());
        System.out.println("Maquina 2. Precio del ticket: " + maquina2.getPrice());
        System.out.println("Máquina 2. Solicitamos ticket.");
        maquina2.printTicket();
        
        maquina3.insertMoney(20);
        System.out.println("Maquina 3. Insertamos " + maquina3.getCantidadIntroducida());
        maquina3.insertMoney(20);
        System.out.println("Maquina 3. Insertamos " + maquina3.getCantidadIntroducida());
        System.out.println("Maquina 3. Contiene monedas por valor de: " + maquina3.getBalance());
        System.out.println("Maquina 3. Precio del ticket: " + maquina3.getPrice());
        System.out.println("Máquina 3. Solicitamos ticket.");
        maquina3.printTicket();
        
        maquina2.insertMoney(20);
        System.out.println("Maquina 2. Insertamos " + maquina2.getCantidadIntroducida());
        System.out.println("Maquina 2. Contiene monedas por valor de: " + maquina2.getBalance());
        System.out.println("Maquina 2. Precio del ticket: " + maquina2.getPrice());
        System.out.println("Máquina 2. Solicitamos ticket.");
        maquina2.printTicket();
        
        System.out.println("Total recaudado por Maquina 1: "+ maquina1.getTotal());
        System.out.println("Total recaudado por Maquina 2: "+ maquina2.getTotal());
        System.out.println("Total recaudado por Maquina 3: "+ maquina3.getTotal());
        System.out.println();
        
        maquina2.insertMoney(80);
        System.out.println("Maquina 2. Insertamos " + maquina2.getCantidadIntroducida());
        System.out.println("Maquina 2. Contiene monedas por valor de: " + maquina2.getBalance());
        System.out.println("Maquina 2. Precio del ticket: " + maquina2.getPrice());
        System.out.println("Máquina 2. Solicitamos devolución.");
        System.out.println();
                     
        System.out.println("Total recaudado por Maquina 1: "+ maquina1.getTotal());
        System.out.println("Total recaudado por Maquina 2: "+ maquina2.getTotal());
        System.out.println("Total recaudado por Maquina 3: "+ maquina3.getTotal());
        System.out.println();
    }
    
}
