/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author ABDUL MOIZ
 */
public class Course {
    private int c_code;
    private String name;
       private ArrayList<Section> sec;
public Course(){
    this(0,"");
    sec=new ArrayList();
}
    public ArrayList<Section> getSec() {
        return sec;
    }

    public void addSection(Section s1){
        this.sec.add(s1);
    }


    public Course(int c_code, String name) {
        this.c_code = c_code;
        this.name = name;
    }

    public int getC_code() {
        return c_code;
    }

    public void setC_code(int c_code) {
        this.c_code = c_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
