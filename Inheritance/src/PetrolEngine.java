public class PetrolEngine extends Engine
{
   int a;
    public void stop()
    {
        super.stop();
        System.out.println("Petrol Engine stop");
    }

    public void start() {
        System.out.println("Petrol Engine Starting");
    }

    public void makenoise()
  {
      System.out.println("Bhhhhrrrrmmmm");
  }
  public void gear()
  {
      System.out.println("gear");
  }
  public void gear(int a,float b)
  {
      System.out.println("Advanced");

  }
}
