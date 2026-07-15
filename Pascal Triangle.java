class Pascal {
    public static void main(String[] args) {
        int n=5,c;
        for(int i=0;i<n;i++){
            c=1;
            for(int j=0;j<=i;j++){
                System.out.print(c+" ");
                c=c*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}