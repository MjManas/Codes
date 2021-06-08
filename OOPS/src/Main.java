public class Main
{
    public static void main(String[] args)
    {
     Teacher teacher= new Javateacher();
     teacher.study();
     teacher.teach();
     ((Javateacher) teacher).getA();

        ((Javateacher)teacher).dance();
    }
}
