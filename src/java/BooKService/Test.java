/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BooKService;

/**
 *
 * @author Animesh Chaturvedi (animesh.chaturvedi88@gmail.com)
 */

import java.io.File;

public class Test {
   public static void main(String[] args) {

      File f = null;

      try{
         // creates temporary file
         f = File.createTempFile("tmp", ".txt", new File("C:/"+"tmps/"));

         // prints absolute path
         System.out.println("File path: "+f.getAbsolutePath());

         // deletes file when the virtual machine terminate
         f.deleteOnExit();

         // creates temporary file
         f = File.createTempFile("tmp", null, new File("D:/"));

         // prints absolute path
         System.out.print("File path: "+f.getAbsolutePath());

         // deletes file when the virtual machine terminate
         f.deleteOnExit();

      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }
}
