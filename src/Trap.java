// calculate water that is trap between building

public class Trap {
    int trapWater(int[] height){
        int ans=0;
        int n=height.length;
        for(int i=0; i<n;i++){
            int leftmax=height[i];
            for(int j=i-1;j>=0;j--){
                leftmax=Math.max(leftmax,height[j]);

            }

            int rightmax=height[i];
            for (int j=i+1;j<n;j++){
                rightmax=Math.max(rightmax,height[j]);
            }
            ans=ans+(Math.min(leftmax,rightmax)-height[i]);

        }

        return ans;
    }
    public static void main(String[] args) {
            Trap t= new Trap();
            int height[]= {2,3,2,1,5};
                // int total water = t.trapwater(height);
        System.out.println(t.trapWater(height));
    }


}
