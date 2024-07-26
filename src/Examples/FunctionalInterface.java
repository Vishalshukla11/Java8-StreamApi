//functional interface are the interface whih contains only one methods in a interface 
public interface FunctionalInterface
{
    public void add();

    default String sayHi()
    {
        return "hi";
    }

    static boolean istrue()
    {
        return true;
    }
}