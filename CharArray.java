public class CharArray {
    public static void main(String[] args) {
        String strPwd="password";
        char[] charPwd=new char[]{'p','a','s','s','w','o','r','d'};
        System.out.println("String Password:"+strPwd);
        System.out.print("Char password:");
        for(char c:charPwd){
        System.out.print(c);
        }
    }
}
