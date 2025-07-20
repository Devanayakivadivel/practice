class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       int []arr=new int[nums1.length+nums2.length];
       double med=0;
       System.arraycopy(nums1,0,arr,0,nums1.length);
       System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
       Arrays.sort(arr);

       if(arr.length%2==1)
        med=arr[arr.length/2];
       
       else
          med=(arr[arr.length/2-1]+arr[arr.length/2])/2.0;

          return med;

    // ArrayList<Integer> list=new ArrayList<>();
    // for(int i:nums1)
    // list.add(i);
    // for(int i:nums2)
    // list.add(i);

    //  Collections.sort(list);
    //  int k=list.size();
    //  double ans=0;
    //  if(k%2==1)
    //    ans=list.get(k/2);
      
    // else
    //    ans=(list.get(k/2-1)+list.get(k/2))/2.0;

    // return ans;
       
    }
}