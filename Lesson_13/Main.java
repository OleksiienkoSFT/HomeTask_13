package Lesson_13;

import Lesson_13.book.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // books
        Book book1 = new Book(1, "Holms part 1", "Arthur Conan Doyle", 10.5, "Detective");
        Book book2 = new Book(2, "Holms part 2", "Arthur Conan Doyle", 15.5, "Detective");
        Book book3 = new Book(4, "Holms part 3", "Arthur Conan Doyle", 19.5, "Detective");
        Book book4 = new Book(6, "Holms part 4", "Arthur Conan Doyle", 18.5, "Detective");
        Book book5 = new Book(8, "Holms part 5", "Arthur Conan Doyle", 17.5, "Detective");
        Book book6 = new Book(10, "Holms part 6", "Arthur Conan Doyle", 100.5, "Detective");
        Book book7 = new Book(12, "Holms part 7", "Arthur Conan Doyle", 108.5, "Detective");
        Book book8 = new Book(13, "Holms part 8", "Arthur Conan Doyle", 58.5, "Detective");
        Book book9 = new Book(15, "Holms part 9", "Arthur Conan Doyle", 99.5, "Detective");
        Book book10 = new Book(19, "Holms part 10", "Arthur Conan Doyle", 510.5, "Detective");
        Book[] arr1 = {book2,book10};
        Book[] arr2 = {book3};
        Book[] arr3 = {book4,book5};

        // employees
        Employee employee1 = new Employee(11,"Valeriy", 25);
        Employee employee2 = new Employee(22,"Aleksiy", 26);
        Employee employee3 = new Employee(33,"Valeriyan", 27);
        // Customers
        Customer customer1 = new Customer(101,"Bill", 55);
        Customer customer2 = new Customer(102,"Bob", 56);
        Customer customer3 = new Customer(103,"Ben", 57);
        Customer customer4 = new Customer(104,"Anri", 58);
        Customer customer5 = new Customer(105,"Jo", 59);
        // orders
        Order order1 = new Order(201, employee1.id,customer1.id,arr1);
        Order order2 = new Order(202, employee2.id,customer2.id,arr2);
        Order order3 = new Order(203, employee3.id,customer3.id,arr3);

        // додаємо книжки в базу даних
        DataBase dataBase_Books = new DataBase();
        dataBase_Books.initData(book1);
        dataBase_Books.initData(book2);
        dataBase_Books.initData(book3);
        dataBase_Books.initData(book4);
        dataBase_Books.initData(book5);
        dataBase_Books.initData(book6);
        dataBase_Books.initData(book7);
        dataBase_Books.initData(book8);
        dataBase_Books.initData(book9);
        dataBase_Books.initData(book10);

        // додаємо клієнтів в базу даних
        dataBase_Books.initData(customer1);
        dataBase_Books.initData(customer2);
        dataBase_Books.initData(customer3);
        dataBase_Books.initData(customer4);
        dataBase_Books.initData(customer5);

        // додаємо продавців в базу даних
        dataBase_Books.initData(employee1);
        dataBase_Books.initData(employee2);
        dataBase_Books.initData(employee3);

        // додаємо замовлення в базу даних
        dataBase_Books.initData(order1);
        dataBase_Books.initData(order2);
        dataBase_Books.initData(order3);

        // книгу по її айді
        dataBase_Books.getBookBy_Id(8);
        System.out.println();

        // загальну кількість проданих книжок
        dataBase_Books.get_Number_Sold_books();
        System.out.println();

        // вартість одного замовлення
        dataBase_Books.get_Sum_Order(order3);
        System.out.println();

        // загальну вартість усіх замовлень
        dataBase_Books.get_Sum_All_Orders();
    }

}
