class TwoStacks{
	int a1[];
	int size;
	int top1;
	int top2;
	
	TwoStack(int n){
		this.size=n;
		this.a1=new a1[n];
		this.top1=-1;
		this.top2=size;
		
	}
	void push1(int e1){
		if(top1>top2-1){
			top1++;
			a1[top1]=e1;
		}
		else{
			System.out.println("Overflow");
			System.exit;
		}
	void push2(int e2){
		if(top1<top2-1){
			top1--;
			a1[top2]=e2;
		}
		else{
			System.out.println("Overflow");
			System.exit;
		}
		
		
	int pop1(){
		if(top1>=0){
			int e1=a1[top1];
			top1--;
			return e1;
		}
		else{
			   System.out.println("Overflow");
			   System.exit;
		}
		
		
		
	int pop2(){
		if(top2<size){
			int e2=a1[top2];
			top2++;
			return e2;
		}
		else{
			   System.out.println("Overflow");
			   System.exit;
		
		
		
	}	
		
		
	}
	
	public static void main(strings[] args){
		
		TwoStacks ts = new ts(5);
		
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.push2(40);
		System.out.println("popped element from stack1"+ts.pop1);
		System.out.println("popped element from stack2"+ts.pop2);
		
	}
}