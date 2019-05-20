package com.immutable.demo;

public class TestDatabaseConnection {

	public static void main(String argsp[]) {
		Driver driver = new Driver();
		driver.setDriverName("MySQL");
		Database database = new Database("TestDb", "sa", "admin", driver);
		System.out.println(database.getDriver().getDriverName());
		database.getDriver().setDriverName("SQL");
		System.out.println(database.getDriver().getDriverName());
	}
}
