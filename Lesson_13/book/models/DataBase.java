package Lesson_13.book.models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public Book book;
    public Employee employee;
    public Customer customer;
    public Order order;

    public DataBase() {
    }

        public DataBase(Book book, Employee employee, Customer customer, Order order) {
        this.book = book;
        this.employee = employee;
        this.customer = customer;
        this.order = order;
    }

    public List<Book> bookList = new ArrayList<>();
    public List<Employee> employeeList = new ArrayList<>();
    public List<Customer> customerList = new ArrayList<>();
    public List<Order> orderList = new ArrayList<>();

    public void initData(Book book) {
        this.bookList.add(book);
    }

    public void initData(Customer customer) {
        this.customerList.add(customer);
    }

    public void initData(Employee employee) {
        this.employeeList.add(employee);
    }

    public void initData(Order order) {
        this.orderList.add(order);
    }

    // Написати метод, що повертає книгу по її айді
    public void getBookBy_Id(int i) {
        for (Book b : bookList) {
            if (b.getId() == i) {
                System.out.println("At Id - " + b.getId() + " is book " + b.getName());
            }
        }
    }

    // Написати метод, що повертає загальну кількість проданих книжок
    public void get_Number_Sold_books() {
        int sold = 0;
        for (Order o : orderList) {
            sold = sold + o.getArr().length;
        }
        System.out.println("Sold - " + sold + " books");
    }

    // Написати метод, що повертає вартість одного замовлення
    public void get_Sum_Order(Order order) {
        double sum = 0;
        for (Book b: order.getArr()){
            sum += b.getPrice();
        }
        System.out.println("Summa this order " + sum);
    }

    // Написати метод, що повертає загальну вартість усіх замовлень
    public void get_Sum_All_Orders (){
        double allSum = 0;
        for (int i = 0; i < orderList.size()-1; i++) {
            for (Book b: orderList.get(i).getArr()){
                allSum += b.getPrice();
            }
        }
        System.out.println("Summa ALL orders is - " + allSum);
    }
}
