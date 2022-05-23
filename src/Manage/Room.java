package Manage;

public class Room implements Comparable<Room>{
    private String kindRom;
    private double priceRoom;
    private String address;

    public Room() {
    }

    public Room(String kindRom, double priceRoom, String address) {
        this.kindRom = kindRom;
        this.priceRoom = priceRoom;
        this.address = address;
    }

    public String getKindRom() {
        return kindRom;
    }

    public void setKindRom(String kindRom) {
        this.kindRom = kindRom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Room: " +
                "kindRom: " + getKindRom() +
                ", priceRoom: " + getPriceRoom() +
                ", address: " + getAddress() ;
    }

    @Override
    public int compareTo(Room o) {
        return 0;
    }
}
