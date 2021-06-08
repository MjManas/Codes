public class engineclient
{
    public static void main(String... args)                    //... -> varargs , It takes all the arguments
    {
        PetrolEngine engine= (PetrolEngine)new Engine();
        engine.start();
        engine.accelerate();
        engine.stop();
        engine.makenoise();
    }
    public void sum(int... a)
    {
        int sum=0;
        for (int i = 0; i <a.length ; i++)
        {
            sum =sum+a[i];
        }
    }
}
