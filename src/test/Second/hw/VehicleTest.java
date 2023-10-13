package Second.hw;

import HW.HW_2.Car;
import HW.HW_2.Motorcycle;
import HW.HW_2.Vehicle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class VehicleTest {

// 1. проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void carInstanceOfVehicleTest(){
        Car bmw = new Car("BMW", "X6", 2022);
        assertThat(bmw).isInstanceOf(Vehicle.class);
    }
// 2. проверка того, что объект Car создается с 4-мя колесами
    @Test
    public void hasCarFourWheelTest (){
        Car hundai = new Car("Hundai", "Palisad", 2023);
        assertThat(hundai.getNumWheels()).isEqualTo(4);
    }
// 3. проверка того, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void hasMotorcycleTwoWheelsTest(){
        Motorcycle ducati = new Motorcycle("Ducatiy", "Streetfighter v4", 2010 );
        assertThat(ducati.getNumWheels()).isEqualTo(2);
    }
// 4. проверка того, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testDriveCarTest(){
        Car toyota = new Car("Toyota", "Tundra", 2018);
        toyota.testDrive();
        assertThat(toyota.getSpeed()).isEqualTo(60);
    }
// 5. проверка того, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testDriveMotorcycleTest(){
        Motorcycle harley = new Motorcycle("Harley Davidson", "Street Glide", 2017);
        harley.testDrive();
        assertThat(harley.getSpeed()).isEqualTo(75);
    }
// 6. проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void parkCarTest(){
        Car vesta = new Car("LADA", "Vests Cross", 2020);
        vesta.testDrive();
        vesta.park();
        assertThat(vesta.getSpeed()).isEqualTo(0);
    }
// 7. проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void parkMotorcycleTest(){
        Motorcycle ural = new Motorcycle("Ural", "Wolf", 2019);
        ural.testDrive();
        ural.park();
        assertThat(ural.getSpeed()).isEqualTo(0);
    }


}
