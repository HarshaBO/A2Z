package JavaBasics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data type : ");
        String str = scanner.next();
        System.out.println("Data Type : " + str + " Size in byte : " +dataTypeSize(str) );
    }

    static int dataTypeSize(String str) {
        // code here
        if(str.equalsIgnoreCase("char")) {
            return 2;
        }
        else if (str.equalsIgnoreCase("short"))
            return 2;
        else if (str.equalsIgnoreCase("int")) {
            return 4;
        } else if (str.equalsIgnoreCase("float")) {
            return 4;
        } else if (str.equalsIgnoreCase("long")) {
            return 8;
        } else if (str.equalsIgnoreCase("double")) {
            return 8;
        } else if (str.equalsIgnoreCase("boolean")) {
            return 1;
        } else
            return 0;

    }
}
