package classes;

import java.util.ArrayList;

public class MenuOrders {
	static int total;
	static ArrayList<Food> finalOrder = new ArrayList<Food>();
	
	public static void orderFromMenu(String pacientName, int clientAge, String employeeName, 
			int employeeSalary, String employeeSpeciality, String foodName, int foodQuantity, int foodPrice) {
	
		Pacient pacient = new Pacient(pacientName, clientAge);
		Food food = new Food(foodName, foodQuantity, foodPrice);
		Medic medic = new Medic(employeeName, employeeSpeciality);
		total = 0;
		pacient.orderFood(food);
		System.out.println("Defining food menu for the pacient");
		medic.insertPreferences(pacient, food, finalOrder);
		for(Food fd:finalOrder){
			total = total + fd.getPrice();
		}
		medic.totalPayment(finalOrder);
		System.out.println("TOTAL PAYMENT:");
		System.out.println("The pacient has to pay a total of" + total + " eur.");
	}

	@Override
	public String toString() {
		return "MenuOrders []";
	}
	
	
}
