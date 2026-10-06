public class Reverse {
    public static void main(String[] args) {
        String name="Mahathi";
        String dev="";
        for(int i=name.length()-1;i>=0;i--){
          dev+=name.charAt(i);
        }
        System.out.println(dev);
    }
}
