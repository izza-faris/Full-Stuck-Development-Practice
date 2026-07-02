public class CabBookingSystem {

    // Cab Class
    static class Cab{

        private boolean available= true;

        public synchronized void bookcab(String customerName) {

            System.out.println(customerName + " is trying to book the cab...");

            if(available){
                System.out.println( customerName + " successfully booked the cab.");
                available = false;
            } else {
                System.out.println( customerName + " failed to book the cab. Cab is not available.");
            }
            
        }
    }


         // Customer Thread Class
        static class Customer extends Thread{
            private Cab cab;
            private String customerName;

            public Customer(Cab cab, String customerName){
                this.cab = cab;
                this.customerName = customerName;
            }

            @Override
            public void run() {
                cab.bookcab(customerName);
            }

 }

    public static void main(String[] args) {
        Cab cab = new Cab();

        Customer customer1 = new Customer(cab, "Customer 1");
        Customer customer2 = new Customer(cab, "Customer 2");
        Customer customer3 = new Customer(cab, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
}
}

