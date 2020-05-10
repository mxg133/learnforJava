package Driver;

public class Texter {
    public static void main(String[] args) {
        Driver male = new MaleDriver();
        Driver female = new FemaleDriver();

        Vehicle bus = new Bus();
        Vehicle car = new Car();

        male.drives(bus);
        male.drives(car);

        female.drives(bus);
        female.drives(car);
    }
}
