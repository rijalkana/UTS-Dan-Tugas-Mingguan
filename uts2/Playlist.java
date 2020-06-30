/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 *
 */
public class Playlist {

    JFileChooser fc = new JFileChooser();
    ArrayList ls = new ArrayList();

    void add(JFrame frame) {
        fc.setMultiSelectionEnabled(true);
        int filevalid = fc.showOpenDialog(frame);
        if (filevalid == javax.swing.JFileChooser.CANCEL_OPTION) {
            return;
        } else if (filevalid == javax.swing.JFileChooser.APPROVE_OPTION) {
            File[] file = fc.getSelectedFiles();
            ls.addAll(Arrays.asList(file));

        }

    }
    ArrayList getlistsong(){
    return ls;
    }
    
//    FileInputStream fis;
//    ObjectInputStream ois;
    
//    public void open(JFrame frame){
//    
//        fc.setMultiSelectionEnabled(false);
//        int valid = fc.showOpenDialog(frame);
//        if(valid == javax.swing.JFileChooser.CANCEL_OPTION){
//        return;
//        }
//        if (valid == javax.swing.JFileChooser.APPROVE_OPTION){
//            File pls = fc.getSelectedFile();
//            try {
//                fis = new FileInputStream(pls);
//                ois = new ObjectInputStream(fis);
//                File tmp;
//                
//                while((tmp = (File) ois.readObject()) != null){
//                ls.add(tmp);
//                } 
//                if ((tmp = (File) ois.readObject()) == null){
//                ls.isEmpty();
//                }
//                ois.close();
//            
//            }catch (Exception e){
//            }
//        }
//        }
    }

