public class stringprac {
    public static void main(String[] args) {
    // problem 1
    String name = "jack parker" ;
    name = name.toLowerCase();
    System.out.println(name);

    // problem 2
    String text = "To Lower Case";
    text = text.replace(" ", "_");
    System.out.println(text);

    // problem 3
    String letter = "Dear <!name!> , Thank a lot";
    letter = letter.replace("<!name!>", "ayush");
    System.out.println(letter);

    // problem 4
    String myString = "This String content  doble and triple space";
    System.out.println(myString.indexOf("  "));
    System.out.println(myString.indexOf("   "));

    // problem 5
    String myletter = "Dear harry ,\n\t this java course is nice.\n\t Thanks";
    System.out.println(myletter);
  }
} 
