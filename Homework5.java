/**
 * Java 1. Homework5
 *
 * @author Elizabeth Sukhoruchko
 * @version 30.01.2022
 */
class Homework5 {
    
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alex Troll", "QA Junior",
                "alextroll@gmail.com", "23121986", 40000, 35),
            new Employee("Michael Mikhailov", "QA Junior", 
                "mikhailow@gmail.com", "13101994", 40000, 27),
            new Employee("Elizabeth Troll", "QA Enginner",
                "ellisa@gmail.com", "23031973", 70000, 48),
            new Employee("Sergey Mikhailov", "Enginner",
                "sergeym@gmail.com", "13101994", 75000, 27),
            new Employee("Daniil Danilov", "Devops enginner",
                "danilovd@gmail.com", "10021986", 90000, 35)
        };
        
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
 
 class Employee {
     private String name;
     private String position;
     private String email;
     private String phone;
     private int salary;
     private int age;
     
     public Employee(String name, String position, String email, String phone,
             int salary, int age) {
         this.name = name;
         this.position = position;
         this.email = email;
         this.phone = phone;
         this.salary = salary;
         this.age = age;         
    } 
    
    public int getAge() { // getter for age
        return age;
    }
    
    @Override
    public String toString() { // override method toString() 
        return (name +
            "\n| Position: " + position +
            "\n| Email: " + email +
            "\n| Phone: " + phone +
            "\n| Salary: " + salary +
            "\n| Age: " + age);
    } 
 }