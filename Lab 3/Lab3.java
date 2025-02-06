package Upes;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

    // Function to find the maximum and minimum elements in an array
    public static int[] findMinMax(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{max, min};
    }

    // Function to find the majority element in an array
    public static int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Function to move all zeroes to the end while maintaining order
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    // Function to reverse words in a string
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverse="";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse+=words[i]+" ";
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Answer 1
        System.out.println("Answer 1");
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Max and Min: " + Arrays.toString(findMinMax(nums1)));

        // Answer 2
        System.out.println("Answer 2");
        System.out.println("Enter the size of array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("Majority Element: " + majorityElement(nums2));

        // Answer 3
        System.out.println("Answer 3");
        System.out.println("Enter the size of array: ");
        int l = sc.nextInt();
        int[] nums3 = new int[l];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < l; i++) {
            nums3[i] = sc.nextInt();
        }
        moveZeroes(nums3);
        System.out.println("After moving zeroes: " + Arrays.toString(nums3));

        // Answer 4
        System.out.println("Answer 4");
        System.out.println("Enter the string: ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String after reversing words: " + reverseWords(str));
    }
}
