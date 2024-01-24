// TC - O(n)
// SC - O(n)

class Solution {
   static class Custom{
        int Value;
        int Index;
        Custom(int Value , int Index){
            this.Value = Value ;
            this.Index  = Index;
        }
    }
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
      int[] nsl = nsl(arr);
      int [] nsr = nsr(arr);
      int []width = new int[n];
      for(int i=0; i<n; i++){
          width[i] = nsr[i] - nsl[i] -1;
      }
      int [] area = new int[n];
      for(int i=0; i<n; i++){
          area[i] = width[i] * arr[i];
      }
      int max = area[0];
      for(int i =1; i<n; i++){
            if(area[i]> max){
                max = area[i];
            }
      }
      return max;


    }
    public int [] nsl(int [] arr){
        int [] left = new int[arr.length];
        Stack<Custom> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                left[i] = -1; // pseudo index;
            }
            else if(!st.isEmpty() && st.peek().Value < arr[i]){
                left[i] = st.peek().Index;
            }
            else if(!st.isEmpty() && st.peek().Value >= arr[i]){
                while(!st.isEmpty() && st.peek().Value >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    left[i] = -1;
                }
                else if(st.peek().Value < arr[i]){
                    left[i] = st.peek().Index;
                }
            }
            st.push(new Custom(arr[i] , i));
        }
    return left;
}

    public int [] nsr(int [] arr){
        int [] right = new int[arr.length];
        Stack<Custom> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            if(st.isEmpty()){
                right[i] = arr.length; // pseudo index;
            }
            else if(!st.isEmpty() && st.peek().Value < arr[i]){
                right[i] = st.peek().Index;
            }
            else if(!st.isEmpty() && st.peek().Value >= arr[i]){
                while(!st.isEmpty() && st.peek().Value >= arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    right[i] = arr.length;
                }
                else if(st.peek().Value < arr[i]){
                    right[i] = st.peek().Index;
                }
            }
            st.push(new Custom(arr[i] , i));
        }
    return right;
}


}