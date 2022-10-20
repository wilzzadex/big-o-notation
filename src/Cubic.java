public class Cubic {
    public static void main(String args[]){
        int n = 30;
        int a = 0;
        for(int c=0; c<n; c++){
            for(int i=0; i<n; i++){
                for(int x=0; x<n; x++){
                    a+=1;
                    System.out.println(a);
                }
            }
        }
    }
}
