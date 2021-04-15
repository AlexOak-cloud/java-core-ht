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
        boolean succefully ;
        Account account = new Account("Aliaksandr", "dubvlecs222", "sdfasdf");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,false))) {
            if(!file.exists()){
                file.createNewFile();
            }
            oos.writeObject(account);
            succefully = true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            Account abc = (Account)ois.readObject();
            System.out.println(abc.getEmail()+ " " + abc.getUserName() + " " + abc.getPassword());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
