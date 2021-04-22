package HomeTask11;

import java.io.*;

public class Account implements Serializable {
    private String userName;
    private String email;
    private transient String password;

    public Account(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Account account = new Account("ASD", "asd", "asd");
        System.out.println(saveAccount(account));
        System.out.println();
        System.out.println(readAccount("D:/JavaFiles/Testing.txt"));
    }

    public static boolean saveAccount(Account account) throws ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/JavaFiles/Testing.txt", false))) {
            oos.writeObject(account);
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean readAccount(String filePath) throws ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Account abc = (Account) ois.readObject();
            System.out.println(abc.getEmail() + " " + abc.getUserName() + " " + abc.getPassword());
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
