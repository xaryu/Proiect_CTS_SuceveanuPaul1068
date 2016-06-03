package main;

import abstractClasses.AConfirmDiscount;
import classes.EmailReservation;
import classes.FinancialDirector;
import classes.Food;
import classes.FoodMenu;
import classes.Hospital;
import classes.HospitalManager;
import classes.MenuOrders;
import classes.Newsletter;
import classes.Pacient;
import classes.Reservation;
import classes.ReservationBuilder;
import classes.phoneReservation;
import classes.rooms.FiveBedsRoom;
import classes.rooms.OneBedRoom;
import classes.rooms.RoomFactory;
import classes.rooms.TwoBedsRoom;
import enums.hopistalRoomTypes;

public class Main {

	public static void main(String[] args) {
		
		
		//factory
		RoomFactory factory = new RoomFactory();
		TwoBedsRoom room2beds = (TwoBedsRoom)factory.reserveRoom(hopistalRoomTypes.TwoBedsRoom);
		room2beds.roomType();
		OneBedRoom oneBedRoom = (OneBedRoom)factory.reserveRoom(hopistalRoomTypes.OneBedRoom);
		oneBedRoom.roomType();
		FiveBedsRoom room5beds = (FiveBedsRoom)factory.reserveRoom(hopistalRoomTypes.FiveBedsRoom);
		room5beds.roomType();
		System.out.println("=========================");
		//strategy
		Reservation reservation1 = new Reservation(new EmailReservation(), new Pacient("Gigel", 44), 7, 10, 14);
		Reservation reservation2 = new Reservation(new phoneReservation(), new Pacient("Mihai", 22), 3, 9, 12);
		System.out.println("Total payment: " + reservation2.getTotal());		
		reservation1.sendReservationRequest();
		reservation2.sendReservationRequest();
		System.out.println("Sent requests!");		
		reservation1.setReservationScheduleType(new phoneReservation());
		reservation1.sendReservationRequest();
		System.out.println("sent phone res request"); 
		reservation1.setPacient(new Pacient("Ion", 39));
		reservation1.sendReservationRequest();
		System.out.println("Total payment: " + reservation1.getTotal());
		
		System.out.println("=========================");
		
		//singleton
		Hospital hospital1 = Hospital.getHospital("DummyHospital",30);
		Hospital hospital = Hospital.getHospital("Spitalul Munincipal", 50);
		System.out.println(hospital1.getCapacity());
		
		System.out.println(hospital.toString());
			
		System.out.println("=========================");

		//observer
		Newsletter newsletter = new Newsletter("May");
		
		Pacient pacient1 = new Pacient("Suceveanu", 46);
		Pacient pacient2 = new Pacient("Mirel", 24);
		Pacient pacient3 = new Pacient("Donel", 49);
		Pacient pacient4 = new Pacient("Mirelus", 20);
		
		newsletter.addObserver(pacient1);
		newsletter.notify(newsletter.toString());

		newsletter.addObserver(pacient2);
		newsletter.addObserver(pacient3);
		newsletter.addObserver(pacient4);
		newsletter.notify(newsletter.toString());
		
		newsletter.removeObserver(pacient3);
		newsletter.notify(newsletter.toString());
		
		System.out.println("=========================");

		//builder
		System.out.println(reservation1.toString());
		Reservation rezPopesco = new ReservationBuilder().setRoomsNumber(5).setPeriod(12).setPacient(new Pacient("Popesco", 66)).setDiscount(10).build();
		Reservation rezIonesco = new ReservationBuilder().setRoomsNumber(1).setPeriod(2).setPacient(new Pacient("Ionesco", 24)).setDiscount(12).build();

		System.out.println(rezIonesco.toString());
		System.out.println(rezPopesco.toString());

		System.out.println("=========================");

		//chain of responsibilities
		AConfirmDiscount financialDirector = new FinancialDirector("TheCashLord", 3000, "shef");
		AConfirmDiscount financialDirector2 = new FinancialDirector("SecondFinDir", 2500, "shef");
		AConfirmDiscount manager = new HospitalManager("TheManager", 5500, "manager");
		AConfirmDiscount manager2 = new HospitalManager("SecondMgr", 7000, "manager");
		System.out.println("Sending for acceptance to managers");
		financialDirector.sendForAcceptance(manager);
		financialDirector.sendForAcceptance(manager2);
		financialDirector.checkDiscount(57);
		
		System.out.println("=========================");

		//facade
		MenuOrders.orderFromMenu("Popescu", 22, "Popa", 900, "Helper", "apa", 500, 3);
		MenuOrders.orderFromMenu("Ionescu", 33, "Mircea", 400, "chef", "coffee", 300, 3);
		
	
		//composite
//		FoodMenu menu = new FoodMenu("Hospital Menu");
//		FoodMenu menuB = new FoodMenu("Hospital Drinks menu");
//		FoodMenu menuA = new FoodMenu("Hospital Food menu");
//		
//		Food drink1 = new Food("water", 200, 4);
//		Food food1 = new Food("salad", 300, 18);
//		Food drink2 = new Food("coffee", 300, 3);
//		Food food2 = new Food("beef stake", 300, 8);
//		Food drink3 = new Food("tea", 500, 3);
//		Food food3 = new Food("fries", 250, 20);
//		Food drink4 = new Food("lemonade", 500, 5);
//		Food food4 = new Food("desert", 250, 18);
//		Food food5 = new Food("mushrooms", 350, 12);
//		Food drink5 = new Food("juice", 500, 7);
//		
//		menuA.add(food1); menuB.add(drink1);
//		menuA.add(food2); menuB.add(drink2);
//		menuA.add(food3); menuB.add(drink3);
//		menuA.add(food4); menuB.add(drink4);
//		menuA.add(food5); menuB.add(drink5);
//		
//		menu.add(menuA);
//		menu.add(menuB);
//		menu.description();

	}
	/*
	 * 
 		1. Factory = tipul saloanelor de spital
		2. Strategy = pacientul incearca sa se interneze prin email sau telefonic
		3. Singleton = un spital 
		4. Observer = atunci cand pacientul face o rezervare, el este adaugat la newsletterul spitalului
		5. Builder = tipul internarii
		6. Chain of responsibility = daca pacientul este eligibil pentru discount, doctorul sef poate accepta 
			doar daca discountul e mai mic de 15%, altfel paseaza la managerul spitalului responsabilitatea 
		7. Facade = Pacientul opteaza pentru un meniu. Medicul noteaza preferintele. II sunt facute nota de externare (totalul de plata)
		8. Composite = Pacientului ii sunt recomandate un set de alimente, atat bauturi cat si mancare
		
	*/
}