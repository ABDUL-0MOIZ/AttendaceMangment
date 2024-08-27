
package entity;

/**
 *
 * @author ABDUL MOIZ
 */
public class Section  {
    
    private String name;
    private String day;
    private String time;
    private Teacher techer;
    public Section(){
  
    this("","","");
      techer = new Teacher(); 
    
}

    public Section(String name, String day, String time ) {
        this.name = name;
        this.day = day;
        this.time = time;
        
    }
    
    public Section(String name, String day, String time, Teacher obj) {
        this.name = name;
        this.day = day;
        this.time = time;
       this.techer = obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Teacher getObj() {
        return techer;
    }

    public void setObj(Teacher obj) {
        this.techer = obj;
    }
    
    
}
