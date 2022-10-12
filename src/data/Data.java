package data;

public class Data {
    private static final String VALID_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (validate(login)) {
            throw new WrongLoginException("Логин не корректный");
        }
        if (validate(password)) {
            throw new WrongPasswordException("Пароль не корректный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совпадает");
        }
        System.out.println("Логин " + login + " успешно создан.");
    }

    public static boolean validate(String s) {
        if (s.length() > 20) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
