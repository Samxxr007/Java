import java.util.*;

class MeanMedianMode {
    public static void main(String[] args) {

        int a[]={16,18,27,16,23,21,19};

        int sum=0;
        for(int i:a)
            sum+=i;

        System.out.println("Mean = "+sum/a.length);

        Arrays.sort(a);
        System.out.println("Median = "+a[a.length/2]);

        int mode=a[0],max=0;

        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                    count++;
            }

            if(count>max){
                max=count;
                mode=a[i];
            }
        }

        System.out.println("Mode = "+mode);
    }
}