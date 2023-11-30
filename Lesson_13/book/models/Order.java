package Lesson_13.book.models;

import java.lang.reflect.Array;

public class Order {
    // унікальний номер
    //унікальний номер продавця
    //унікальний номер покупця
    //список книг, які продали !!!
    //Конструктор, гетери та сетери є й у цьому класі

    int id;
    int id_Employee;
    int id_Customer;
    Book[] arr;

    public Order(int id, int id_Employee, int id_Customer, Book[] arr) {
        this.id = id;
        this.id_Employee = id_Employee;
        this.id_Customer = id_Customer;
        this.arr = arr;
    }

    public int getId() {
        return id;
    }

    public int getId_Employee() {
        return id_Employee;
    }

    public int getId_Customer() {
        return id_Customer;
    }

    public Book[] getArr() {
        return arr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_Employee(int id_Employee) {
        this.id_Employee = id_Employee;
    }

    public void setId_Customer(int id_Customer) {
        this.id_Customer = id_Customer;
    }

    public void setArr(Book[] arr) {
        this.arr = arr;
    }
}
