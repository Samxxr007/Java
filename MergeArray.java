import java.util.*;

class MergeArray {
    public static void main(String[] args) {

        int arr1[]={1,3,4,5};
        int arr2[]={2,4,6,8};

        ArrayList<Integer> list=new ArrayList<>();

        for(int i:arr1)
            list.add(i);

        for(int i:arr2)
            list.add(i);

        Collections.sort(list);

        System.out.println(list);
    }
}