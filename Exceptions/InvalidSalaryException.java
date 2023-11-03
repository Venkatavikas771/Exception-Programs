import java.util.*;

class InvalidSalaryException extends Exception
  {
    InvalidSalaryException(String s)
    {
      super(s);
    }
  }
    class Details
      {
        String name;
        float salary;
        Details(String name,float salary)
        {
          this.name=name;
          this.salary=salary;
        }
        public void addemp()
        {
          System.out.println(name+" is added");
          
        }
        public void rememp()
        {
           System.out.println(name+" is removed");
        }
        public void disemp()
        {
           System.out.println("employee name is :"+name);
        }

  }
  class Employee
    
    {
      
    
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the salary of emp1"); 
    float salary1=sc.nextFloat();
     Details obj=new Details("Vikas",salary1);
      obj.addemp();
      obj.rememp();
      obj.disemp();
      System.out.println("Enter the salary of emp2"); 
    float salary2=sc.nextFloat();
     Details obj1=new Details("Mohan",salary2);
      obj1.addemp();
      obj1.rememp();
      obj1.disemp();
              
    System.out.println("Enter the minimum age of your country"); 
    float minwage=sc.nextFloat();
      try{
        if(salary1<minwage)
{
throw new InvalidSalaryException("Invalid salary for emp 1");
}
else
  
{
System.out.println("Valid salary for emp 1");  
}
    }
catch(InvalidSalaryException e)
      {
      System.out.println(e.getMessage()); 
}
      try{
       if(salary2<minwage)
{
throw new InvalidSalaryException("Invalid salary for emp 2");
}
else
  
{
System.out.println("Valid salary for emp2");  
}
    }
    
catch(InvalidSalaryException ex)
      {
      System.out.println(ex.getMessage()); 

      
      
    }
  }
    }
  
                        