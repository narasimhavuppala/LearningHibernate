package pl.hubert.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//Domy�lne, oby�oby si� bez tego:
@DiscriminatorValue("Profesorek")
public class Professor extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}