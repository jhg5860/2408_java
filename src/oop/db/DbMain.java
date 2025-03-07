package oop.db;

import java.util.List;
import java.util.stream.Stream;

public class DbMain {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        List<UserDTO> result = dao.getUsers(2,0);
        System.out.println(result.toString());

        Stream<UserDTO> stream = result.stream();
        stream.forEach(user -> System.out.println(user.getAccount()));
    }
}
