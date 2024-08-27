
package entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ABDUL MOIZ
 */
public class University {
    public static ArrayList<Teacher> techr;
    public static ArrayList<Student> stud;
    static{
    techr=new ArrayList();
    stud=new ArrayList();
}
     public static void erorr(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void addtecher(Teacher t){
        if(t!=null){
        University.techr.add(t);
        }
        else{
            erorr("Techer data is null");
        }
    }
    public static void addstudent(Student s){
        if(s!=null){
        University.stud.add(s);
        }
        else{
            erorr("Techer data is null");
        }
    }

    public static ArrayList<Student> getStud() {
        return stud;
    }
    
    public static boolean check(String pswd,String name){
        for(int i=0;i < techr.size();i++){
            if(techr.get(i).getName().equals(name)&&techr.get(i).getTpswd().equals(pswd)){
                return true;
                
            }
        }
        return false;
    }

    public static boolean checkstd(String pswd,String name){
        for(int i=0;i < stud.size();i++){
            if(stud.get(i).getName().equals(name)&&stud.get(i).getPsvd().equals(pswd)){
                return true;
                
            }
        }
        return false;
    }
    public static ArrayList<Teacher> getTechr() {
        return techr;
    }
   
}
