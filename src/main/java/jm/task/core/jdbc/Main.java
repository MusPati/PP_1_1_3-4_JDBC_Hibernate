package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Vadim", "Ivanov", (byte)36);
        user.saveUser("Petr", "Yakovlev", (byte)28);
        user.saveUser("Mariya", "Popova", (byte)24);
        user.saveUser("Kseniya", "Topilina", (byte)27);

        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();


        // реализуйте алгоритм здесь
    }
}
