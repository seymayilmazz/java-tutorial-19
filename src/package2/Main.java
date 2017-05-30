package package2;

import package1.Employee;
import package1.Person;
import package1.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();

        List list = new ArrayList();
        list.add(person);
        list.add(student);
        list.add(employee);

        for(int i = 0; i < list.size(); i++){
            Object o = list.get(i);
            /* nesne person sinifindan mi olusturulmus
             * nesne person sinifi ornegi mi?
             */
            if(o instanceof Student){
                System.out.println("i degeri : " + i + " , student nesnesi ");
            }
            else if(o instanceof Employee){
                System.out.println("i degeri : " + i + " , employee nesnesi ");
            }
            else if(o instanceof Person){
                System.out.println("i degeri : " + i + " , person nesnesi ");
            }
        }
    }
}
