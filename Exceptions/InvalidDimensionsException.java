class InvalidDimensionsException extends Exception
  {
    InvalidDimensionsException(String s)
    {
      super(s);
    }
  }

class circle
{
   float radius;
  
    }
  
class Rectangle
  {
    int length;
    int width;
  }
class Careaperimeter extends Circle
  {
    System.out.println("Area of the circle is :"+(3.14*radius*radius));
  }
class Rareaperimeter extends Rectangle
  {
    System.out.println("Area of the circle is :"+length*width);
  }