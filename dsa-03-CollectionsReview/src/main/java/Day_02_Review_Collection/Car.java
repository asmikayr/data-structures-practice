package Day_02_Review_Collection;

import java.util.Objects;

public class Car {

    private int id;
    private String make;

    public Car(int id, String make) {
        this.id = id;
        this.make = make;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                '}';
    }
}
