class Addition{
	public void add(int...x){
		int sum=0;
		for(int i=0;i<x.length;++i){
			sum=sum+x[i];
		}
		System.out.println("Sum >> "+sum);
	}
}
class VarArgsOrEllipseApproach{
	public static void main(String args[]){
		Addition a=new Addition();
		a.add(10,20,50,60);
		a.add(10,20,50,60,88,44,22,55,33,11);
		a.add(10,20,50,60,757,939,932,988);
		a.add(10,20);
		a.add(10,20,50,60,987);
		a.add(10,20,50,60,9866,8786);
	}
}