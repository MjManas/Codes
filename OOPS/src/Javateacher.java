public class Javateacher implements Teacher
{
    private int a=6;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int b;
    @Override
    public void teach()
    {
        System.out.println("Java Padhata Hun!");
    }

    @Override
    public void study()
    {
        System.out.println("Padh Chuka Hun");
    }
    public void dance()
    {
        System.out.println("I Dance In Java");
    }
}
