/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB KSI
 */

public class person {
    String name;
    int age;// Student status
    
    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama = "Dimas Saputra";
        String NIM = "E41230041";
        String status = "Aktif";
        
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(status);               
    }
    
}