class Person {
    int aadhar;
    String name;
    Address permanentAddress;
    Address tempAddress;
    Address offAddress;
}
class Worker extends Person {
    public Worker(int aadhar, String name, Address permanentAddress, Address tempAddress, Address offAddress) {
        this.aadhar = aadhar;
        this.name = name;
        this.permanentAddress = permanentAddress;
        this.tempAddress = tempAddress;
        this.offAddress = offAddress;
    }
}
class Address {
    String street;
    String flat;
    String pincode;

    public Address(String street, String flat, String pincode) {
        this.street = street;
        this.flat = flat;
        this.pincode = pincode;
    }
}
public class multiinheritance {
    public static void main(String[] args) {
        Address permAddress = new Address("Main Street", "Flat 101", "123456");
        Address tempAddress = new Address("2nd Street", "Flat 202", "654321");
        Address offAddress = new Address("Office Street", "Flat 303", "789012");

        Worker worker = new Worker(123456789, "John Doe", permAddress, tempAddress, offAddress);

        System.out.println("Worker Name: " + worker.name);
        System.out.println("Permanent Address: " + worker.permanentAddress.street + ", " + worker.permanentAddress.flat + ", " + worker.permanentAddress.pincode);
        System.out.println("Temporary Address: " + worker.tempAddress.street + ", " + worker.tempAddress.flat + ", " + worker.tempAddress.pincode);
        System.out.println("Office Address: " + worker.offAddress.street + ", " + worker.offAddress.flat + ", " + worker.offAddress.pincode);
    }
}
