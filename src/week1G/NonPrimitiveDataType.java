package week1G;

public class NonPrimitiveDataType {


    public static void main(String [] args){

        String name = "Greg";
        System.out.println("Name: "+ name);

        int nameLength = name.length();

        System.out.println("Length of name: " + nameLength);

        String text = "this is all lowercase letters";

        String upper = text.toUpperCase();

        System.out.println(upper);

        System.out.println(text.toLowerCase());
    }


}
