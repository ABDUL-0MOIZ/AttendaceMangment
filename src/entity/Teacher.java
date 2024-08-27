/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ABDUL MOIZ
 */
public class Teacher extends Peron {
   
    
   private String t_id;
   private String tpswd;
   private Section section;

   
   
   
   
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
   
   
   
   
   
   
    public Teacher() {
    
        this("","","","","","");
        section = new Section();
      
    }

    public Teacher(String tname,String phno,String address,String temail, String t_id, String tpswd) {
        this.t_id = t_id;
        this.tpswd = tpswd;
    }
    

    public Teacher(String tname,String email,String phno,String address,String t_id, String tpswd,Section obj) {
        super( tname , phno,address,email);

        this.t_id = t_id;
        this.tpswd = tpswd;
        this.section=obj;
    }


    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public String getTpswd() {
        return tpswd;
    }

    public void setTpswd(String tpswd) {
        this.tpswd = tpswd;
    }
    }
