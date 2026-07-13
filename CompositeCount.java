class CompositeCount {
    public static void main(String[] args) {

        int a[]={16,18,27,16,23,21,19};

        int count=0;

        for(int n:a){

            int factors=0;

            for(int i=1;i<=n;i++){
                if(n%i==0)
                    factors++;
            }

            if(factors>2)
                count++;
        }

        System.out.println("Composite Numbers = "+count);
    }
}