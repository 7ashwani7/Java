//Floyd's Triangle Pattern
    // 1 
    // 2 3 
    // 4 5 6 
    // 7 8 9 10 
    
    // A 
    // B C 
    // D E F 
    // G H I J
public class Pattern_9 {
    public static void main(String[] args) {
        int n=4,num=1;
        for(int i=0;i<n ;i++){
            for(int j=0; j<i+1;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
        char ch='A';
        for(int i=0;i<n ;i++){
            for(int j=0; j<i+1;j++){
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }

    }
    
}
