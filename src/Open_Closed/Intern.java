package Open_Closed;

public class Intern {
    String name;
    String company;

    public String getname() {
        return name;
    }

    public String getcompany() {
        return company;
    }

    public Intern() {
        setname("Rohit Raj");
        setcompany("Knoldus");
    }

    public void setcompany(String company)
    {
        this.company=company;
    }

    public void setname(String name)
    {
        this.name = name;
    }
}
