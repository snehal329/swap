public class TestSwapByRef {

	public static void main(String[] args) {
		SwapByRef sw=new SwapByRef();
		int[] arr=new int[2];
		int a=10,b=20;
		arr[0]=a;
		arr[1]=b;
		System.out.println("Before swap a="+arr[0]+"b="+arr[1]);
		sw.SwapByRef(arr);
		System.out.println("After swap a="+arr[0]+"b="+arr[1]);

	}

}
