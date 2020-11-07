package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int usr = - 1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                usr = i;
            }
        }
        if (usr == - 1) {
            throw new UserNotFoundException();
        }
        return users[usr];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException();
        }
        return user.isValid();
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Rostislav Egorov", true)
        };
        try {
            User user = findUser(users, "Rostislav Egorov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
