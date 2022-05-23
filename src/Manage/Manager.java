package Manage;

import java.sql.Date;
import java.util.*;

public class Manager {
    Scanner sc = new Scanner(System.in);
    LinkedList<Room> listRoom =new LinkedList<>();
    ArrayList<Guest> listGust = new ArrayList<>();
    public  void menu(){
        System.out.println("------Menu-------");
        System.out.println("1.Create a new room!");
        System.out.println("2..Create a new Gust!");
        System.out.println("3.Show rooms!");
        System.out.println("4.Show Gust!");
        System.out.println("5.Find Gust!");
        System.out.println("Select:");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                creatRoom();
                break;
            case 2:
                creatGust();
                break;
            case 3:
                displayRoom();
                break;
            case 4:
                displayGust();
                break;
            case 5:
                 findGust();
                break;
        }
    }
    public void creatRoom(){
        System.out.println("Kind of room:");
        String kindRoom = sc.nextLine();
        System.out.println("Price room:");
        double priceRoom =Double.parseDouble(sc.nextLine());
        System.out.println("Address room:");
        String addressRoom = sc.nextLine();
        listRoom.add(new Room(kindRoom,priceRoom,addressRoom));
    }
    public  void creatGust(){
        System.out.println("Input full name:");
        String fullName= sc.nextLine();
        System.out.println("Input day of gust:");
        int  day =Integer.parseInt( sc.nextLine());
        System.out.println("In put month bird of gust:");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Input year bird of gust:");
        int year = Integer.parseInt( sc.nextLine());
        System.out.println("Input id number Gust:");
        int idGust = Integer.parseInt(sc.nextLine());
        listGust.add(new Guest(fullName,new Date(year-1900,month-1,day),idGust));
    }
    public void displayRoom(){
        listRoom.sort(new SortPriceRoom());
        for (Room r:listRoom){
            System.out.println(r);
        }
    }
    public void displayGust(){
       listGust.sort(new SortDateGust());
        for (Guest g:listGust){
            System.out.println(g);
        }
    }
    public void findGust(){
        System.out.println("Input name you want find:");
        String findName = sc.nextLine();
        System.out.println("Name you want search:");
        for(int i=0;i< listGust.size();i++){
            if(listGust.get(i).getFullName().equals(findName)){
                System.out.println(listGust.get(i));
            }
        }
    }
}
