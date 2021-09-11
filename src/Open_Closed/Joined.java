package Open_Closed;

public class Joined extends Employee_ID
{
    String date="19th July 2021";
    String name="Rohit Raj";


    public void onboarding(String getname, String s, int n)
    {
        System.out.println("This is from Open Closed Responsibility and here to let you that");
        System.out.println(name+" has joined "+company+" on "+date+" his Employee ID is "+emp);
    }

    public static void main(String[] args) {
        Intern I= new Intern();
        Employee_ID E=new Employee_ID();
        Joined J=new Joined();
        J.onboarding(I.getname(),E.getname(),E.getemp());

    }
}
