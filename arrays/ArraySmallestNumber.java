class ArraySmallestNumber {
    public static void main(String[] args) {
        int[] arr = {35,41,18,78,2,97,21,31,42,6};
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<smallest) {
                smallest = arr[i];
            }

            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println("SMALLEST VALUE FROM THE ARRAY IS - "+smallest);
        System.out.println("LARGEST VALUE FROM THE ARRAY IS  - "+largest);
    }
}
