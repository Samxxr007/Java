class CharacterPattern {
    public static void main(String[] args) {
        char ch='%';
        int n=3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
}