package lesson_02;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = ++a + b++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        /*
        * prefix tinh dau tien a++, gan' gia tri moi vao Right operand, 3./ assign result vao left operand. 4./ postfix b++
        * ++a = 2 (1+1)
        * c = ++a + b = 2 + 2 = 4
        * b++ = 3 (2+1)
        * printout: a = 1, b = 3, c = 4
        * */
    }
}
