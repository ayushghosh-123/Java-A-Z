public class stringmethod {
     public static void main(String[] args){
          //   String a = "harry";
          //   String a1 = new String("Harry");

            String name = "harry";
            System.out.println(name);
            int value = name.length();
          //   String value = name.toLowerCase();
            System.out.println(value);
          //   String value = name.toUpperCase();
            System.out.println(value);
            String nonTrimmedstring = "      HARRY    ";
            System.out.println(nonTrimmedstring);

            String trimmedestring = nonTrimmedstring.trim();
            System.out.println(trimmedestring);

            System.out.println(name.substring(1));
            System.out.println(name.substring(1,4));

            System.out.println(name. replace('r', 'p'));
            System.out.println(name. replace("r", "ier"));

            System.out.println(name.startsWith("har"));
            System.out.println(name.startsWith("dd"));

             System.out.println(name.charAt(2));
             System.out.println(name.indexOf("ry"));

           String modifiedName = "Harryrryrry";
           System.out.println(modifiedName.indexOf("rry", 4));
           System.out.println(modifiedName.lastIndexOf("rry", 4));

           System.out.println(name.equals("harry"));
          System.out.println(name.equalsIgnoreCase("harry"));

          
     }
}
