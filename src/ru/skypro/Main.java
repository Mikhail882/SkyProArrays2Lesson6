package ru.skypro;

public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("����� ���� �� ����� ��������� " + sum + " ������");

        //������ 2
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int b = 0; b < arr.length; b++) {
            if (minSum > arr[b])
                minSum = arr[b];
            if (maxSum < arr[b])
                maxSum = arr[b];
        }
        System.out.println("����������� ����� ���� �� ���� ��������� " + minSum + " ������");
        System.out.println("������������ ����� ���� �� ���� ��������� " + maxSum + " ������");
//        int min = arr[0];
//        for (int xx: arr) {
//            if (xx < min)
//                min = xx;
//        }
//                System.out.println("����������� ����� ���� �� ���� ��������� "+ min +" ������");
//
//        int max = arr[0];
//        for (int xx: arr) {
//            if (xx > max)
//                max = xx;
//        }
//                System.out.println("������������ ����� ���� �� ���� ��������� "+ max +" ������");

        //������ 3
        double average = 0;
            average = sum / arr.length;
        System.out.println("������� ����� ���� �� ����� ��������� "+ average +" ������");

        //������ 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i = reverseFullName.length - 1, j = 0;
        char[] let = new char[reverseFullName.length];
        while (i >= 0) {
            let[j] = reverseFullName[i];
            i--;
            j++;
        }
        for (char c : let) {
            System.out.print(c);
        }
    }
}



