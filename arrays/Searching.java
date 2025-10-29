class Searching {
    public static void main(String[] args) {
        int[] arr = {35,41,18,78,2,97,21,31,42,6};
        int key = 2;
        // boolean flag = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]) {
                // flag= true;
                index = i;
                break;
            }
        }

        // if (flag==true) {
        if (index!=-1) {
            System.out.println("ELEMENT FOUND AT INDEX - "+index);
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
