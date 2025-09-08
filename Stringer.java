public class Stringer {
    public static void main(String[] args){

    String name = "LastMinutePrep";

    int length = name.length(); //length of the string
    char letter = name.charAt(0); //to locate the character at index
    int index = name.indexOf("P"); //index of given character
    int lastIndex = name.lastIndexOf("e"); //index of character placed in the string at the end
    
    name = name.toUpperCase();

    System.out.println(length); 
    System.out.println(letter);
    System.out.println(index);
    System.out.println(lastIndex);
    System.out.println(name);


    }

}
