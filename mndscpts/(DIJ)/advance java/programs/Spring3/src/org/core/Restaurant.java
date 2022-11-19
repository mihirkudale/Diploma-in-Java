package org.core;

import java.util.List;

public class Restaurant {
	private List restaurantWaiterList;


	public void setRestaurantWaiterList(List restaurantWaiterList) {
		this.restaurantWaiterList = restaurantWaiterList;
	}
	public void displayWaiterName() {
		System.out.println("All waiters woking in restaurant are:"+restaurantWaiterList);
	}

}
