/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt527;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author anthony_jsc
 */
public class ClassRoom {
    String name;
    String address;
    List<Student> studentList = new ArrayList<>();
//    ArrayList<Student> studentList = new ArrayList<>();
    Student std;
    public ClassRoom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
   
    public void input(List<Student> students ){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        std.fullname = input.nextLine();
        
        System.out.println("Nhap ngay sinh: ");
        std.birthday = input.nextLine();
        
        System.out.println("Nhap email: ");
        std.email = input.nextLine();
        
        System.out.println("Nhap dia chi: ");
        std.address = input.nextLine();
        
        System.out.println("Nhap gioi tinh: ");
        std.gender = input.nextLine();
        
        students.add(std);
    }

    public void display (){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "ClassRoom{" + "name=" + name + ", address=" + address + ", studentList=" + studentList + '}';
    }
    
    
}