package array;

public class RightRotate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]={10,20,30,40,50,60,70};
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		
	}
	int Step=5;
	for(int j=0;j<Step;j++){
		int lastelement=arr[arr.length-1];
		for(int k=arr.length-1;k>0;k--){
			arr[k]=arr[k-1];
			}
		arr[0]=lastelement;
		}
	System.out.println();
	
	for(int l=0;l<arr.length;l++){
		System.out.println(arr[l]);
		
		}
}
}