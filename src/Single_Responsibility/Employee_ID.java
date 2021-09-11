package Single_Responsibility;

public class Employee_ID {
    public String name;
    int emp;
    String salary;

    public int getEmp() {
        return this.emp;
    }

    public String getname() {
        return this.name;
    }

    public String getSalary() {
        return this.salary;
    }

    private void setsalary(String fifteen_thousands_only) {
    }

    private void setemp(String s) {
    }

    private void setname(String rohit_raj) {
    }

    public Employee_ID() {
        setname("Rohit Raj");
        setemp("1618");
        setsalary("Fifteen Thousands only");
    }
}
