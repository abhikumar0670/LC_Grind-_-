class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea=0;
        int n=points.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    double area=triangleArea(points[i],points[j],points[k]);
                    if(area>maxArea) maxArea=area;
                }
            }
        }
        return maxArea;
    }
    private double triangleArea(int[] a,int[] b,int[] c){
        return 0.5*Math.abs(a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1]));
    }
}