class Bitwise {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.println(x & y);
        System.out.println(6 & 4);

        System.out.println(x | y);
        System.out.println(6 | 4);
    }
}


// 0 1 0 1
// 0 0 1 1
// ________________
// 0 0 0 1
// 0 1 1 1

/**************************************************/

// 0 1 1 0
// 0 1 0 0
// ________________
// 0 1 0 0
// 0 1 1 0