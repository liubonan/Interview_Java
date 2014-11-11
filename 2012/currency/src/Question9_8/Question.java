package Question9_8;

public class Question {
        public static int makeChange(int n, int denom) {
                //System.out.println(n + " " + denom);
                int next_denom = 0;
                switch (denom) {
                case 200:
                	next_denom = 100;
                    break;
                case 100:
                	next_denom = 50;
                    break;
                case 50:
                	next_denom = 20;
                    break;
                case 20:
                        next_denom = 10;
                        break;
                case 10:
                        next_denom = 5;
                        break;
                case 5:
                        next_denom = 2;
                        break;
                case 2:
                    next_denom = 1;
                    break;
                case 1:
                        return 1;
                }
                int ways = 0;
                for (int i = 0; i * denom <= n; i++) {
                        ways += makeChange(n - i * denom, next_denom);
                }
                return ways;
        }
        
        public static int makeChange(int n) {
                return makeChange(n, 200);
        }
        
        public static void main(String[] args) {
                for (int i = 200; i <= 200; i++) {
                        System.out.println("makeChange(" + i + ") = " + makeChange(i));
                }
        }

}