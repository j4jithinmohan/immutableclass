package com.immutable.demo;

public final class Database {

	private final String name;
	private final String userName;
	private final String password;
	private Driver driver;

	public Database(String name, String userName, String password, Driver driver) {
		Driver clonedObj = new Driver();
		clonedObj.setDriverName(driver.getDriverName());
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.driver = clonedObj;
	}

	public Driver getDriver() {
		Driver clonedObj = new Driver();
		clonedObj.setDriverName(this.driver.getDriverName());
		return clonedObj;
	}

	public String getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
