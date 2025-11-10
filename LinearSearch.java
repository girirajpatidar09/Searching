package Searching;
class Search
{
    public int search(int x[],int target)
    {
        int i;
        for(i=0;i<x.length;i++)
        {
            if(x[i]==target)
            {
                return i;
            }
        }
        return -1;

    }
}

public class LinearSearch {
    public static void main(String[] args) {
        Search s1 = new Search();
        int x[]={1,3,5,7,9};
        System.out.println( s1.search(x,5));
    }
    
}
