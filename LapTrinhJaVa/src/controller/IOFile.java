/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.SinhVien;

/**
 *
 * @author admin
 */
public class IOFile {
    public void ghi(ArrayList list,String name){
        try(FileOutputStream out =new FileOutputStream(new File(name))){
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
        }catch(Exception e){
            System.out.println("got an exception!");
        }
    }
    public ArrayList doc(String name){
        ArrayList list=new ArrayList();
        try(FileInputStream out =new FileInputStream(new File(name))){
            ObjectInputStream oos = new ObjectInputStream(out);
            list = (ArrayList) oos.readObject();
        }catch(Exception e){
            System.out.println("got an exception!");
        }
        return list;
    }

  
}
