import java.util.Scanner;
public class interview {
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(
            "Enter number of Students who have taken TPP: ");

        int n = sc.nextInt();
   
        String[] ar = new String[n];
        String[] arr = new String[n];
        double[] arr1 = new double[n];

        int[] arr2 = new int[n];

        double[] s1 = new double[n];
        double[] s2 = new double[n];
        double[] s3 = new double[n];

    
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter UID of Student "
                            + (i + 1) + ": ");
            ar[i] = sc.nextLine();
            System.out.print("Enter Name of Student "
                            + (i + 1) + ": ");
            arr[i] = sc.nextLine();
            System.out.print("Enter CGPA of Student "
                            + (i + 1) + ": ");
            arr1[i] = sc.nextDouble();
            System.out.print("Enter AMCAT Score of Student "
                            + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
            System.out.print("\n");
        }

        System.out.println(
            "\nFor Google Students having CGPA above 7.00 and AMCAT score above 600 are eligible for further tests");
        System.out.println("\nShortlisted Students are:");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.00) {
                if (arr2[i] >= 600) {
                    System.out.printf(
                        "%-12s%-16s%-12f%-6d\n", ar[i],
                        arr[i], arr1[i], arr2[i]);
                }
            }
        }

        System.out.println(
            "\nFor Microsoft Students having CGPA above 7.50 and AMCAT score above 750 are eligible for further tests");
        System.out.println("\nShortlisted Students are:");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.50) {
                if (arr2[i] >= 750) {
                    System.out.printf(
                        "%-12s%-16s%-12f%-6d\n", ar[i],
                        arr[i], arr1[i], arr2[i]);
                }
            }
        }

        System.out.println(
            "\nFor Amazon Students having CGPA above 8.00 and AMCAT score above 700 are eligible for further tests");
        System.out.println("\nShortlisted Students are:");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 8.00) {
                if (arr2[i] >= 700) {
                    System.out.printf(
                        "%-12s%-16s%-12f%-6d\n", ar[i],
                        arr[i], arr1[i], arr2[i]);
                }
            }
        }

        System.out.print(
            "\nEnter Coding test Scores for Google:");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.00) {
                if (arr2[i] >= 600) {
                    System.out.print(
                        "\nEnter Coding Test score of UID "
                        + ar[i] + ": ");
                    s1[i] = sc.nextDouble();
                }
            }
        }

        System.out.print(
            "\nEnter Coding test Scores for Microsoft:");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.50) {
                if (arr2[i] >= 750) {
                    System.out.print(
                        "\nEnter Coding Test score of UID "
                        + ar[i] + ": ");
                    s2[i] = sc.nextDouble();
                }
            }
        }
        System.out.print(
            "\nEnter Coding test Scores for Amazon:");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 8.00) {
                if (arr2[i] >= 700) {
                    System.out.print(
                        "\nEnter Coding Test score of UID "
                        + ar[i] + ": ");
                    s3[i] = sc.nextDouble();
                }
            }
        }

        System.out.println(
            "\nStudents eligible to sit for Google interview ");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.00) {
                if (arr2[i] >= 600) {
                    if (s1[i] > 80) {
                        System.out.printf(
                            "%-12s%-16s%-12f%-6d\n", ar[i],
                            arr[i], arr1[i], arr2[i]);
                    }
                }
            }
        }

        System.out.println(
            "\nStudents eligible to sit for Microsoft interview ");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 7.50) {
                if (arr2[i] >= 750) {
                    if (s1[i] > 70) {
                        System.out.printf(
                            "%-12s%-16s%-12f%-6d\n", ar[i],
                            arr[i], arr1[i], arr2[i]);
                    }
                }
            }
        }
        System.out.println(
            "\nStudents eligible to sit for Amazon interview ");
        System.out.print(
            "UID\t\t\tName\t\t\tCGPA\t\tAMCAT\n");
        for (int i = 0; i < n; i++) {
            if (arr1[i] >= 8.00) {
                if (arr2[i] >= 700) {
                    if (s1[i] > 80) {
                        System.out.printf(
                            "%-12s%-16s%-12f%-6d\n", ar[i],
                            arr[i], arr1[i], arr2[i]);
                    }
                }
            }
        }
    }
}