import v0.ParkingCustomerv0;
import v0.ParkingTicketv0;
import v0.Vehiclev0;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------v0-------");
        v0Test();

        System.out.println();

        System.out.println("-------v1-------");
        v1Test();

        System.out.println();

        System.out.println("-------v2-------");
        v2Test();
    }

    public static void v0Test() {
        Vehiclev0 myBike = new Vehiclev0("34F1-14165", 1);
        ParkingCustomerv0 me = new ParkingCustomerv0("Nam");

        ParkingTicketv0 ticket1 = new ParkingTicketv0(myBike, 3);
        ParkingTicketv0 ticket2 = new ParkingTicketv0(myBike, 9);
        ParkingTicketv0 ticket3 = new ParkingTicketv0(myBike, 4);

        me.addTicket(ticket1);
        me.addTicket(ticket2);
        me.addTicket(ticket3);

        System.out.println(me.receipt());
    }

    public static void v1Test() {
        v1.Vehicle myBike = new v1.Vehicle("34F1-14165", 1);
        v1.ParkingCustomer me = new v1.ParkingCustomer("Nam");

        v1.ParkingTicket ticket1 = new v1.ParkingTicket(myBike, 3);
        v1.ParkingTicket ticket2 = new v1.ParkingTicket(myBike, 9);
        v1.ParkingTicket ticket3 = new v1.ParkingTicket(myBike, 4);

        me.addTicket(ticket1);
        me.addTicket(ticket2);
        me.addTicket(ticket3);

        System.out.println(me.receipt());
    }

    public static void v2Test() {
        v2.Vehicle myBike = new v2.Bike("34F1-14165");
        v2.ParkingCustomer me = new v2.ParkingCustomer("Nam");

        v2.ParkingTicket ticket1 = new v2.ParkingTicket(myBike, 3);
        v2.ParkingTicket ticket2 = new v2.ParkingTicket(myBike, 9);
        v2.ParkingTicket ticket3 = new v2.ParkingTicket(myBike, 4);

        me.addTicket(ticket1);
        me.addTicket(ticket2);
        me.addTicket(ticket3);

        System.out.println(me.receipt());
    }
}
