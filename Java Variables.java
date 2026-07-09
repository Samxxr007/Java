class Demo {
    int x = 10;           
    static int y = 20;    

    void show() {
        int z = 30;       
        System.out.println(x + " " + y + " " + z);
    }

    public static void main(String[] args) {
        new Demo().show();
    }
}