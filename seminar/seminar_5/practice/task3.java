// Задача 3. Подсчет продуктов в корзине
// Создайте программу для учета продуктов в корзине. Программа должна
// позволять добавлять, удалять, обновлять количество продуктов, а также
// проверять наличие продуктов в корзине. Используйте HashMap для хранения
// продуктов и их количества.
// Методы:
// ● addProduct(String product, Integer quantity): Добавляет
// продукт с указанным количеством в корзину. Если продукт уже есть,
// увеличивает его количество.
// ● removeProduct(String product): Удаляет продукт из корзины. Если
// продукт отсутствует, ничего не делает.
// ● updateQuantity(String product, Integer quantity): Обновляет
// количество продукта в корзине. Если продукта нет, ничего не делает.
// ● checkProduct(String product): Проверяет, есть ли продукт в
// корзине и возвращает его количество. Если продукта нет, возвращает 0.
// ● showBasket(): Выводит все продукты и их количество в корзине.


package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

public class task3 {
        public static void main(String[] args) {
            String product1, product2, product3;
            Integer quantity1, quantity2, quantity3;
            
            product1 = "apple";
            product2 = "banana";
            product3 = "apple";
            quantity1 = 3;
            quantity2 = 2;
            quantity3 = 5;
            
            ShoppingBasket basket = new ShoppingBasket();

            basket.addProduct(product1, quantity1);
            basket.addProduct(product2, quantity2);
            basket.addProduct(product3, quantity3);
            
            System.out.println("Basket after adding products:");
            basket.showBasket();

            basket.removeProduct("banana");
            System.out.println("Basket after removing 'banana'");
            basket.showBasket();
            basket.updateQuantity("apple", 10);
            System.out.println("basket after updating quantity of 'apple");
            basket.showBasket();

            System.out.println("Quantity of 'apple': " + basket.checkProduct("apple"));
            System.out.println("Quantity of 'banana': " + basket.checkProduct("banana"));
        }
}
