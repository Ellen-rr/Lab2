class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    /*declare variables*/
    int total;
    double blue; 
    double brown;
    double green;
    double orange;
    double red;
    double yellow;
    double sum;

    total = 55 * 10;
    blue = total * 0.24;
    brown = total * 0.13;
    green = total * 0.16;
    orange = total * 0.2;
    red = total * 0.13;
    yellow = total * 0.14;
    sum = blue + brown + green + orange + red + yellow;

    System.out.println ("Sum: " + sum);

    if (blue > brown && green > orange){
      System.out.println("Blue over Brown and Green over Orange");
    }
    if (brown <= red){
      System.out.println("Brown is less than or equal to Red");
    }
    if (sum == total){
      System.out.println("Numbers match");
    }


  }

}