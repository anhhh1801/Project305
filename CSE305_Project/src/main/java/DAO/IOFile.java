/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viet Anh
 */
public class IOFile implements Serializable {

    public void save(User user, String file) {
        try (FileOutputStream out = new FileOutputStream(new File(file))) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(user);
        } catch (Exception e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
    }

    public void saveUsers(ArrayList<User> list) {
        try (PrintWriter pw = new PrintWriter(new File("User.DAT"))) {
            for (User u : list) {
                pw.println(u.getName());
                pw.println(u.getPassword());
            }
        } catch (Exception e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
    }

    public ArrayList readUser() {
        ArrayList<User> list = new ArrayList<>();
        try (Scanner reader = new Scanner(new File("User.DAT"))) {
            while (reader.hasNext()) {
                User u = new User();
                u.setName((String) (reader.nextLine()));
                u.setPassword((String) (reader.nextLine()));
                list.add(u);
            }
        } catch (Exception e) {
            System.out.println("Got an exception");
        }
        return list;
    }
    
    public User read(String file) {
        User user = null;
        try (FileInputStream in = new FileInputStream(new File(file))) {
            ObjectInputStream ois = new ObjectInputStream(in);
            user = (User) ois.readObject();
        } catch (FileNotFoundException e) {
        } catch (Exception e) {
            System.out.println("Got an exception: " + e.getMessage());
        }
        return user;
    }
}
