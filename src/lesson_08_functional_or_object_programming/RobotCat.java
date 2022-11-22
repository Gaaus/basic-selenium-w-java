package lesson_08_functional_or_object_programming;

import java.util.Date;

public class RobotCat {
    /*
    * Create a template / blueprint of object RobotCat
    * */
    private String name;
    private Date birthday;


    public RobotCat() {

    }

//    public RobotCat(String catName) {
//        name = catName;
    public RobotCat(String name) {
        this.name = name;
    }

    // Getter

    public String getName() {
        return this.name;
//        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
