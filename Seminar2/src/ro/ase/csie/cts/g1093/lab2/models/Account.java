package ro.ase.csie.cts.g1093.lab2.models;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount);
	public abstract void Transfer(Account destination, Double amount);
}
