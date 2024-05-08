package pawtropolis.animals.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
	private String name;
	private String favoriteFood;
	private int age;
	private LocalDate joinDate;
	private double weight;
	private double height;

	public Animal(String name, String favoriteFood, int age, LocalDate joinDate, double weight, double height) {
		this.name = name;
		this.favoriteFood = favoriteFood;
		this.age = age;
		this.joinDate = joinDate;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Animal animal = (Animal) o;
		return age == animal.age
				&& Double.compare(animal.weight, weight) == 0
				&& Double.compare(animal.height, height) == 0
				&& Objects.equals(name, animal.name)
				&& Objects.equals(favoriteFood, animal.favoriteFood)
				&& Objects.equals(joinDate, animal.joinDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, favoriteFood, age, joinDate, weight, height);
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", favoriteFood='" + favoriteFood + '\'' +
				", age=" + age +
				", joinDate=" + joinDate +
				", weight=" + weight +
				", height=" + height +
				'}';
	}
}
