package tile;

import entity.car.PlayerCar;
import entity.item.Bullet;
import entity.item.ItemManager;
import entity.item.SuperItem;
import main.Panel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollisionCheckerTest {

    // Check that 2 cars colliding correctly returns true from the Collision Checker
    @Test
    void whenCarCollision_ReturnTrue() {
        new Panel();
        // Car 1
        PlayerCar car1 = new PlayerCar();
        car1.xMapPos = 900;
        car1.yMapPos = 950;
        // Car 2
        PlayerCar car2 = new PlayerCar();
        car2.xMapPos = 910; // within collision area
        car2.yMapPos = 960;
        // Assert
        boolean collisionResultExpected = true;
        boolean collisionResultActual = CollisionChecker.checkEntityCollision(car1, car2);
        assertEquals(collisionResultExpected, collisionResultActual);
    }

    // Check that a bullet on a bullet correctly returns true from the Collision Checker
    @Test
    void whenItemCollision_ReturnTrue() {
        new Panel();
        // Bullet 1
        ItemManager.createBullet(900, 950, 'R');
        SuperItem item1 = ItemManager.items.get(ItemManager.items.size()-1);
        // Bullet 2
        ItemManager.createBullet(901, 950, 'L');
        SuperItem item2 = ItemManager.items.get(ItemManager.items.size()-1);
        // Assert
        boolean collisionResultExpected = true;
        boolean collisionResultActual = CollisionChecker.checkItemCollision(item1, item2);
        assertEquals(collisionResultExpected, collisionResultActual);
    }
}