package pa;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    private int cantidadIntroducida;

   

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
        cantidadIntroducida = 0;
   
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
        cantidadIntroducida = amount;
        
    }
    
    //Creamos un método get para ver qué cantidad de dinero es introducido cada vez.
    public int getCantidadIntroducida()
    {
        return cantidadIntroducida;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {  
        int dinero = 0;
        if (price > balance){
            dinero = price - balance;
            System.out.println("Introduzca al menos "+dinero+" céntimos más.");
            System.out.println();
            total = total + balance;
        }
        else{
            if (price < balance){
                dinero = balance - price;      
                System.out.println("Le sobran "+dinero+" céntimos.");
                System.out.println("Puede solicitar la devolución.");
            }

            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            
            // Update the total collected with the balance.
            total = total + (balance - dinero);
            refundBalance();
        }
        

    }  
    
    
    public int getTotal() {
        return total;
    }
    
    public void refundBalance(){
        balance = balance-price;
    }
}

    
