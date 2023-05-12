package week4.day5;

public class Hospital {
    String name;
    String websiteAdress;
    Address address;

    public Hospital(String name, String websiteAdress, Address address) {
        this.name = name;
        this.websiteAdress = websiteAdress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAdress() {
        return websiteAdress;
    }

    public Address getAddress() {
        return address;
    }
}
