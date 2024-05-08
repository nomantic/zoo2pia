package pawtropolis.animals.domain;

import java.time.LocalDate;
import java.util.Objects;

public abstract class AnimalWithWings extends Animal {
	private double wingspan;

	protected AnimalWithWings(String name, String favoriteFood, int age, LocalDate joinDate, double weight, double height, double wingspan) {
		super(name, favoriteFood, age, joinDate, weight, height);
		this.wingspan = wingspan;
	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AnimalWithWings that = (AnimalWithWings) o;
		return super.equals(o)
				&& Double.compare(that.wingspan, wingspan) == 0;
	}

	@Override
	public int hashCode() {
		return super.hashCode()
				+ Objects.hash(wingspan);
	}
}
