package package1;

import com.sun.deploy.perf.PerfRollup;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Şeyma");
        student.setAge(22);
        student.setDepartment("Computer");
        student.setNo("g131210026");

        Person person = student;
        person.setAge(11);
        person.setName("Şeyma yılmaz");

        Object object = person;
        Object object2 = student;

        Person person2 = (Person) object;

        /* */
        Employee employee = new Employee();
        employee.setName("Burak Köken");
        employee.setAge(22);
        employee.setJobName("Computer");
        employee.setSalary(4000);

        Person person1 = (Person) employee;
        person1.setName("Burak Kökennn");
        person1.setAge(23);

        Object o = (Object) person1;
        Object o2 = (Object) employee;

    }

}
