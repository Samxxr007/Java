import java.util.Scanner;

class NameSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name[]={"Banana","Carrot","Radish","Apple","Jack"};

        System.out.print("Order (A/D): ");
        char ch=sc.next().charAt(0);

        for(int i=0;i<name.length-1;i++){
            for(int j=i+1;j<name.length;j++){

                if((ch=='A'||ch=='a') && name[i].compareTo(name[j])>0){
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }

                if((ch=='D'||ch=='d') && name[i].compareTo(name[j])<0){
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }

        for(String x:name)
            System.out.println(x);
    }
}