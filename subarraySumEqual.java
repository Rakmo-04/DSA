import java.util.*;
public class subarraySumEqual {
    public static void subArraySum(int[] arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0,ans=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            map.put(sum,1);
        }
        
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        subArraySum(arr,target);
    }
}
