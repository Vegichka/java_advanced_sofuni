package company_employees;

public class Employee {
      //name, salary, position, department, email, and age
      private String name;
      private double salary;
      private String position;
      private String department;
      private String email;
      private int age;

      // must include -> name, salary, position, and department

       public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = -1;
        this.email = "n/a";
    }

    public Employee(String name, double salary, String position, String department, int age) { //plus only age 
        this(name, salary, position, department);
        this.age = age;
    }

    //plus only email
    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department);
        this.email = email;
    }

    //plus email AND age => ползвам горния Employee с only email и добавям age
    public Employee(String name, double salary, String position, String department, String email, int age) {
        this(name, salary, position, department, email);
        this.age = age;
    }

      public int getAge() {
          return age;
      }
      public void setAge(int age) {
          this.age = age;
      }
      public String getName() {
          return name;
      }
      public void setName(String name) {
          this.name = name;
      }
      public double getSalary() {
          return salary;
      }
      public void setSalary(double salary) {
          this.salary = salary;
      }
      public String getPosition() {
          return position;
      }
      public void setPosition(String position) {
          this.position = position;
      }
      public String getDepartment() {
          return department;
      }
      public void setDepartment(String department) {
          this.department = department;
      }
      public String getEmail() {
          return email;
      }
      public void setEmail(String email) {
          this.email = email;
      }
      @Override
      public String toString(){
        return String.format("%s %d %s %d" , this.name, this.salary, this.email, this.age);
    }

}
