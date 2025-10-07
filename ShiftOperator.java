class ShiftOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        System.out.println(x << y); // 6
        System.out.println(2 << 3); // 16
        System.out.println(3 << 2); // 12
        System.out.println(6 << 1 << 1); //24

        System.out.println(x >> y); // 1
        System.out.println(2 >> 3); // 0
        System.out.println(3 >> 2); // 0
        System.out.println(6 >> 1 >> 1); //1
        System.out.println(6 >> 1 << 1); //6
        
    }
}

// ((2*2)*2)*2

// 3 => 0011

// <- 0 <- 0 <- 1 <- 1

// 0 1 1 0