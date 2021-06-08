public class TA implements Teacher,Student
{

    @Override
    public void teach() {
        System.out.println("I Teach");
    }

    @Override
    public void study()
    {
        System.out.println("I study");
    }
}
