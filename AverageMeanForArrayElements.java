import java.util.Scanner;
class AverageMeanForArrayElements {
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        double average = calculateAverage(numbers);
		int sum=calculateSum(numbers);
		System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
}
