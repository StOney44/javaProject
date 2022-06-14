package ch03;

public class StringTest {
    public static void main(String[] args) {

//        concat을 사용하는 경우 메모리를 계속 할당하기 때문에 안좋아, StringBuffer & StringBuilder 사용해
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);

        System.out.println(System.identityHashCode(java));
    }
}
