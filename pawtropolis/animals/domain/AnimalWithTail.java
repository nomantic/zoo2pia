package pawtropolis.animals.domain;

import java.time.LocalDate;
import java.util.Objects;

public abstract class AnimalWithTail extends Animal {
	private double tailLength;

	protected AnimalWithTail(String name, String favoriteFood, int age, LocalDate joinDate, double weight, double height, double tailLength) {
		super(name, favoriteFood, age, joinDate, weight, height);
		this.tailLength = tailLength;
	}

	public double getTailLength() {
		return tailLength;
	}

	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AnimalWithTail that = (AnimalWithTail) o;
		return super.equals(o)
		&& Double.compare(that.tailLength, tailLength) == 0;
	}

	@Override
	public int hashCode() {
		return super.hashCode()
		+ Objects.hash(tailLength);
	}
}
