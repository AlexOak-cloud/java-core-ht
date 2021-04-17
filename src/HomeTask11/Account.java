package HomeTask11;

import java.io.*;

public class Account implements Serializable {
    private String userName;
    private String email;
    private transient String password;
    private static File file = new File("D:/JavaFiles/Testing.txt");

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
        Account account = new Account("ASD","asd" ,"asd");
        System.out.println(saveAccount(account));
        System.out.println();
        System.out.println(readAccount(file));
    }
    public static boolean saveAccount(Account account)throws ClassNotFoundException {
        boolean succefully = false;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false))) {
            if (!file.exists()) {
                file.createNewFile();
            }
            oos.writeObject(account);
            succefully = true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return succefully;
    }

    public static boolean readAccount(File file) throws ClassNotFoundException {
        boolean succefully = false;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Account abc = (Account) ois.readObject();
            System.out.println(abc.getEmail() + " " + abc.getUserName() + " " + abc.getPassword());
            succefully = true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return succefully;
    }
}
