package sort;
/**
 *
 * @author  LiJing 
 * @date    2017年9月7日 上午10:41:56
 * @Version 1.0
 *
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr={7,6,5,4,3,2,1,1,0,7,6,5,8,2,1,4};
		for(int i=1;i<arr.length ;i++){
			for(int j=0;j<i;j++){
				if(arr[i-j]<arr[i-j-1]){
					int temp=arr[i-j];
					arr[i-j]=arr[i-j-1];
					arr[i-j-1]=temp;
				} else 
					break;
			}
		}
		for(int p:arr){
			System.out.print(p+"  ");
		}
	}

}
