package Single_Responsibility;

public class Intern {
    String name;
    String company;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public Intern() {
        setname("Rohit Raj");
        setcompany("Knoldus");
    }

    private void setcompany(String knoldus) {
    }

    private void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return  name;
    }
}
