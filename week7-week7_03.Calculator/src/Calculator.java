/**
 * @author PiotrKrol
 */
public class Calculator 
{
    private Reader reader;
    private int counter;
    
    public Calculator()
    {
        reader = new Reader();
        this.counter = 0;
    }
    public void start() 
    {
        while (true) 
        {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) 
            {
                break;
            }
            if (command.equals("sum")) 
            {
                sum();
            } 
            else if (command.equals("difference")) 
            {
                difference();
            } 
            else if (command.equals("product")) 
            {
                product();
            }
        }
        statistics();
    }
    private void sum()
    {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       System.out.println("sum: "+ (value1 + value2));
       counter++;
    }
    private void difference()
    {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       System.out.println("difference: "+ (value1 - value2));
       counter++;
    }
    private void product()
    {
       System.out.print("value1: ");
       int value1 = reader.readInteger();// read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();// read the value using the Reader-object
       System.out.println("product: "+ (value1 * value2));
       counter++;
    }
    private void statistics()
    {
        System.out.println("Calculation done "+ this.counter);
    }
}
