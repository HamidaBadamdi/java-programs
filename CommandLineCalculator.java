package pkg;

class CommandLineCalculator
{
    public static void main(String[] args)
    {
        int result  =0 ;

        System.out.println("Value 1: " + args[0]);
        System.out.println("Value 2: " + args[1]);
        System.out.println("Operator: " + args[2]);


        if(args[2].equals("+"))
        {

            result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.print("Addition : " + result);
        }

        else if(args[2].equals("-"))
        {

            result = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
            System.out.print("Subtraction : " + result);
        }

        else if(args[2].equals("*"))
        {

            result = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
            System.out.println("Multiplication: " + result);
        }

        else if(args[2].equals("/"))
        {

            result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println("Division : " + result);
        }

        else if(args[2].equals("%"))
        {

            result = Integer.parseInt(args[0]) % Integer.parseInt(args[1]);
            System.out.println("Modulo Division : " + result);
        }

    }
}
