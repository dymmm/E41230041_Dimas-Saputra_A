/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author LAB KSI
 */
public class managingpeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        person p1 = new person("Arial", 37);
        person p2 = new person("Joseph", 15);
                
        if(p1.getAge()==p2.getAge())
        {
            System.out.println(p1.getName()+" is the same age as " +p2.getName());
        }
        else
        {
            System.out.println(p1.getName()+" is NOT the same age as " +p2.getName());
    }
  }  
}
