package lesson_08_functional_or_object_programming;

import java.util.Date;

public class RobotCatTest {
    /*
    * This is where to create and object, call , run test for that new object of RobotCatTest
    * */
    public static void main(String[] args) {
        // meomeo is a RobotCat class object
        // new --> call constructor to create an object (default method in blueprint)
        RobotCat meomeo = new RobotCat("meomeo");

        System.out.println("Ten object RobotCat moi tao la: " + meomeo.getName());

        meomeo.setName("MieuQuyToc");

        System.out.println("RobotCat Object meomeo duoc doi thanh: " + meomeo.getName());

        meomeo.setBirthday(new Date(2022-1900,0,1));
        System.out.println(meomeo.getBirthday());
    }
}
