class Sorting {
    public static void main(String[] args) {
        int[] arr = { 35, 41, 18, 78, 2, 97, 21, 31, 42, 6 };

        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("SORTED ARRAY ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
