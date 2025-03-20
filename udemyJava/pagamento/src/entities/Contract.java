package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private double totalValue;
	
	private List<Installment> installment = new ArrayList<>();
	
	public Contract() {
		// TODO Auto-generated constructor stub
	}

	public Contract(Integer number, LocalDate date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}	
}
